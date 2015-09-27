public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);
        
        int index = 0;
        
        while(index<nums.length-2 && nums[index]<=Math.abs(target)){
            int lo = index+1, hi = nums.length-1;
            while(lo<hi){
                int sum = nums[index]+nums[lo]+nums[hi];
                if(sum>target)
                    hi--;
                else
                    lo++;
                
                if(Math.abs(sum-target) <= Math.abs(res-target))
                    res = sum;
            }
            index++;
        }        
        return res;
    }
}

/*
	For every element in the array, there is only one set of three-element group that added up closest to the target.
	Go over the input array to find one group that has smallest difference between target.
	PS. Sort the input array first
*/