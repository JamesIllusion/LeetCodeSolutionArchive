public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        else{
            int current = 0;
            for(int i=1; i<nums.length; i++){
                while(nums[current]!=nums[i]){
                    current++;
                    nums[current] = nums[i];
                }
            }
            return current+1;
        }
    }
}

/*
	Two pointers. First pointer going through list as general. Second pointer used to identify duplicate element. While there is 
	duplicate element, first pointer keeps moving, while the second stays. When the first is going beyond duplicate, start to swap
	with duplicate elements using the second.
*/