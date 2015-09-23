public class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length<=2)
            return nums;
        
        int[] ans = new int[2];
        HashSet<Integer> nums_hset = new HashSet<Integer>();
        
        for(int i=0; i<nums.length; i++){
            if(nums_hset.contains(nums[i]))
                nums_hset.remove(nums[i]);
            else
                nums_hset.add(nums[i]);
        }
        
        Object[] test = nums_hset.toArray();
    ans[0]=(int)test[0];
    ans[1]=(int)test[1];
        
        return ans;
    }
}

/*
	For all the elements in the array, every first time we see it, put it in the container(HashSet).
	When it is seen for the second time, remove it from the container. The only one left is what we are looking for
*/	