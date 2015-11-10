public class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> nums_hs = new HashSet<Integer>();
        
        for(int i=0; i<nums.length; i++){
            if(!nums_hs.contains(nums[i]))
                nums_hs.add(nums[i]);
            else
                nums_hs.remove(nums[i]);
        }
        
        Iterator<Integer> it = nums_hs.iterator();
        return it.next();
    }
}

/*
	Use hashset as a containner to store numbers and remove numbers that seen twice
*/