public class Solution {
    public int findMin(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
            
        int lo = 0, hi = nums.length-1;
        
        
        
        while(lo<hi){
            while(nums[lo]==nums[hi] && lo!=hi)
                lo++;
            
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
	Using binary search to locate the position. Using the second while loop to avoid duplicate elements
*/