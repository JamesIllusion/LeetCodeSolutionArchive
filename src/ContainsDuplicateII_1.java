import java.util.*;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> nums_map = new HashMap<Integer,Integer>();
        
        for(int i=0; i<nums.length; i++){
            if(!nums_map.containsKey(nums[i]))
                nums_map.put(nums[i], i);
            else{
                int temp = Math.abs(i-nums_map.get(nums[i]));
                if(temp<=k)
                    return true;
                else
                    nums_map.put(nums[i], i);
            }
        }
        
        return false;
    }
}

/*
	Similar idea as before, if element is not met, then add to hashtable; when see again, calculate the distance
*/