public class Solution {
    public void sortColors(int[] nums) {
        int red_count = 0, white_count = 0, blue_count = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0)
                red_count++;
            else if(nums[i]==1)
                white_count++;
            else if(nums[i]==2)
                blue_count++;
        }
        
        for(int i=0; i<red_count; i++)
            nums[i] = 0;
        for(int i=red_count; i<white_count+red_count; i++)
            nums[i] = 1;
        for(int i=white_count+red_count; i<nums.length; i++)
            nums[i] = 2;
        
    }
}

/*
	Straight forward solution. Count the number of occurence of each color and then put back into the array
*/