public class Solution {
    public int maxProfit(int[] prices) {
        int pro=0;
        int lo=0;
        int hi=0;
        
        for(int i=0; i<prices.length-1; i++){
            if(prices[i]<=prices[i+1]){
                hi=i+1;
                lo=i;
                pro+=prices[hi]-prices[lo];
            }
            else{
                lo=i+1;
                hi=i;
//                pro+=prices[hi]-prices[lo];
            }
            
        }
        
        return pro;
    }
}

//not a real-time capable algorithm. 3-1 = (2-1)+(3-2) but does not mean the same thing.