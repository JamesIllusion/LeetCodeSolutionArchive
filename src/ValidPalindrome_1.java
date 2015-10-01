public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s=s.replaceAll("[^0-9a-zA-Z]", "");

        int lo = 0, hi = s.length()-1;
        
        if(s.length()<=1)
            return true;
        
        while(lo<=s.length()-1 && hi>=0 && lo<=hi){

            
            char charLo = s.charAt(lo);
            char charHi = s.charAt(hi);
            
            if(charLo != charHi)
                return false;
                
            lo++;
            hi--;
        }
        
        return true;
    }
}

/*
	Similar to Palindrome word.
	Ps. change all characters to lower case first, and then use regular expression to trim all symbols and spaces.
	[^0-9a-zA-Z]
*/