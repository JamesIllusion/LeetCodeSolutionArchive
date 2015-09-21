public class Solution {
    public int removeElement(int[] nums, int val) {
//        int i = 0;
        int j = nums.length;
        
        for(int i=0; i<nums.length; i++){
            while(nums[i]==val && i<j){
                nums[i] = nums[--j];
            }
//            if(i>=(j-1))
//                break;
        }
        
        return j;
    }
    
    void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}