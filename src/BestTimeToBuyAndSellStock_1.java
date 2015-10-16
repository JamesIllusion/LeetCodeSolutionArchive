public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2)
            return 0;
        
        int maxCur = 0, maxTotal = 0;
        
        for(int i=1; i<prices.length; i++){
            maxCur = Math.max(0, maxCur+=prices[i]-prices[i-1]);
            maxTotal = Math.max(maxCur, maxTotal);
        }
        
        return maxTotal;
    }
}

/*
	Dynamic Programming solution.
*/