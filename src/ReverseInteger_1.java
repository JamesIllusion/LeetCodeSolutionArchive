public class Solution {
    public int reverse(int x) {
        long res = 0;
        boolean flag = false;
               
        while(x!=0){
            res = res*10 + x%10;
            x /= 10;
            
            if(res>Integer.MAX_VALUE  || res<Integer.MIN_VALUE){
                return 0;
            }
        }
        
        return (int)res;
    }
}

/*
	Straight forward solution, simply math work.
	Ps. be careful of overflow
*/