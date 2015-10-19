public class Solution {
    public int findMin(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
            
        int lo = 0, hi = nums.length-1;
        
        while(lo<hi){
            int mid = (lo+hi)/2;
            
            if(nums[hi] < nums[mid])
                lo = mid+1;
            else
                hi = mid;
            
        }
        return Math.min(nums[lo], nums[hi]);
    }
}

/*
	Binary search solution. If the mid number is bigger than the last number, that means min value is in the second half
	else, it is in the first half
*/