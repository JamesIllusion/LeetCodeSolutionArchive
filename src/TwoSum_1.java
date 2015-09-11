public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        index[0]=0;
        index[1]=0;
        int temp=0;
        
        for(int i=0; i<nums.length; i++){
            temp=target-nums[i];
            for(int j=0; j<nums.length; j++){
                if(nums[j]==temp && i!=j){
                    index[0]=j+1;
                    index[1]=i+1;
                    break;
                }
            }
        }       
        return index;
    }
}