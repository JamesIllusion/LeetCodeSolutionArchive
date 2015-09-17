import java.util.*;

public class Solution {
    public int singleNumber(int[] nums) {
        int single=0;
        Hashtable<Integer, Integer> nums_ht = new Hashtable<Integer, Integer>();
        
        for(int i=0; i<nums.length; i++){
            if(!nums_ht.containsKey(nums[i])){
                nums_ht.put(nums[i], 1);
            }
            else
                nums_ht.put(nums[i], 2);
        }
        
        for(int index=0; index<nums.length; index++){
            if(nums_ht.get(nums[index])==1)
                single=nums[index];
        }
        
        return single;
    }
}