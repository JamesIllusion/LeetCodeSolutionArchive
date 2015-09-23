import java.util.*;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean ContainDup = false;
        Hashtable<Integer, Integer> nums_ht = new Hashtable<Integer, Integer>();
        
        for(int i=0; i<nums.length; i++){
            if(nums_ht.containsKey(nums[i])){
                ContainDup = true;
                break;
            }
            else
                nums_ht.put(nums[i], 1);
                
        }
        
        return ContainDup;
    }
}

/*
	Using Hashtable, if a element is not seen before, add it new to the table, if it is seen, then plus 
	the value to the key.
*/