public class Solution {
    public void moveZeroes(int[] nums) {
        int curr = 0;
        int pos_0 = 0;
        
        while(curr<nums.length){
            if(nums[curr]==0){
//                pos_0 = curr;
                curr++;
            }
            else{
                for(int i=0; i<curr; i++)
                    if(nums[i]==0){
                        nums[i] = nums[curr];
                        nums[curr] = 0;
                    }
                curr++;
            }
        }
    }
}

/*
	Stright forward solution. Going over the given array, if it is 0, then skip; if not, then switch with
	0 in front of the element.
*/