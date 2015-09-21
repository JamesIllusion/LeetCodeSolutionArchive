public class Solution {
    public int titleToNumber(String s) {
        int colNum=0;
        
        for(int i=0; i<s.length(); i++){
            colNum+= (s.charAt(s.length()-1-i)-'A'+1) * Math.pow(26,i);
        }
        
        return colNum;
    }
}