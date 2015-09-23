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

/*
	Trim first, to cut off the space at the beginning and end (especially for the end). And check from the end,
	when pointer hits space, stop.
*/