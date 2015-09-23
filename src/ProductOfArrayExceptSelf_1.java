public class Solution {
    public int[] productExceptSelf(int[] nums) {
//        int n = nums.length;
        int[] output = new int[nums.length];
        
        output[0] = 1;
        for (int i = 1; i < nums.length; i++)
            output[i] = output[i-1] * nums[i-1];
    
        int right = 1;
        for (int i = nums.length- 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }
        
        return output;
    }
}

/*
	For the first loop, start from the left end of the array, each corresponding cell stores the product from left.
	For the second loop, start from the right end of the array, complete the result
*/