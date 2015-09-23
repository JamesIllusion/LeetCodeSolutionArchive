public class Solution {
    public int addDigits(int num) {
        int result=0;
        
        String sTmp = Integer.toString(num);
        int[] arTmp = new int[sTmp.length()];
        
        for(int i=0; i<sTmp.length(); i++)
            result+=sTmp.charAt(i)-'0';
        
        while(result>=10)
            result-=9;
        
        return result;
    }
}

/*
	Straight forward solution from question. Transit the input int into char and then add back to int.
	Do the math work to calculate result
*/