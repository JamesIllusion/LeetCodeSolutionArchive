public class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        
        int result = 0;
        
        if(nums.length==1){
            result = nums[0];
            return result;
        }
            
        
        for(int i=0; i<nums.length-3;i+=3 ){
            if(nums[i]!=nums[i+1] && nums[i]!=nums[i+2]){
                result = nums[i];
                break;
            }
                //result = nums[i];
            //else
              //  i +=3;
        }
        
        if(nums[nums.length-1]!=nums[nums.length-2]){
            result = nums[nums.length-1];
            return result;
        }
            
    
        return result;
    }
}

/*
	Sort the input array first. If a number has appeared 3 times, that means i, i+1, i+2 should be same.
	If not same, then it appears only once.
	PS. add special case for the single number in the last of the array.
*/