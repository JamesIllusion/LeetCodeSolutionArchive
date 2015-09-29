public class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty())
            return true;
            
        Stack<Character> verifier = new Stack<Character>();
        
        for(int i=0; i<s.length(); i++){
            switch(s.charAt(i)){
                case '(':
                    verifier.push('(');
                    break;
                case '[':
                    verifier.push('[');
                    break;
                case '{':
                    verifier.push('{');
                    break;
                case ')':
                    if(verifier.empty() || verifier.pop()!='(')
                        return false;
                    break;
                case ']':
                    if(verifier.empty() || verifier.pop()!='[')
                        return false;
                    break;
                case '}':
                    if(verifier.empty() || verifier.pop()!='{')
                        return false;
                    break;
            }
        }
        
        return verifier.empty();
    }
}

/*
	Using stack to store all left ({[, and when scan to a right half, check the top of stack. If matches, true, else fail
*/