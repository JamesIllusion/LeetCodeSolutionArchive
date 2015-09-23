import java.util.*;

public class Solution {
    public int majorityElement(int[] nums){
        int major = 0;
        Hashtable<Integer, Integer> nums_ht = new Hashtable<Integer, Integer>();
        
        for(int i=0; i<nums.length; i++){
            if (!nums_ht.containsKey(nums[i]))
                nums_ht.put(nums[i], 1);
            else{
                int temp = nums_ht.get(nums[i]);
                temp++;
                nums_ht.put(nums[i], temp);
            }
        }
        
        for(int i=0; i<nums.length; i++){
            if(nums_ht.get(nums[i])>nums.length/2)
                major=nums[i];
        }
        
        return major;
    }
}

/*
	Using Hashtable to count number of occurence. And then find the key with the value bigger than n/2
*/