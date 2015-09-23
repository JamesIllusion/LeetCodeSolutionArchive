public class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n>0 && (n&(n-1))==0);
    }
}

/*
	For all the numbers equals power of 2, n-1 has all '1's in the binary form
*/