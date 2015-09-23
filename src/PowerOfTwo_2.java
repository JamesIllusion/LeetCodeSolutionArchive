public class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && Integer.bitCount(n) == 1;
    }
}

/*
	In binary, all numbers equals power of 2, would only have 1 digit of '1'
*/