public class Solution {
    public int maxSubArray(int[] nums) {
        int currMax = nums[0];
        int finalMax = currMax;
        
        for(int i=1; i<nums.length; i++){
            currMax = Math.max(nums[i], currMax+nums[i]);
            finalMax = Math.max(finalMax, currMax);
        }
        
        return finalMax;
    }
}

/*
	Typical Dynamic Programming issue. When going through each element, we have to decide which is bigger,
	current element or previous sum plus the current element. Then compare this current sum with previous 
	biggest subarray sum.
*/