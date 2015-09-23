public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int digit = 0;
        
        while(n!=0){
            digit += (n&1);
            n=n>>>1;
        }
        
        return digit;
    }
}

/*
	Straight forward solution. Right shift the input number 1 bit each time. '&' 1 operation to each bit.
*/