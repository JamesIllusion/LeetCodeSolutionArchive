public class Solution {
    public int lengthOfLastWord(String s) {
        int lastLen=0;
        
        s=s.trim();
        
        for(int index=s.length()-1; index>=0; index--){
            if(s.charAt(index)!=' ')
                lastLen++;
            else
                break;
        }
        
        return lastLen;
    }
}