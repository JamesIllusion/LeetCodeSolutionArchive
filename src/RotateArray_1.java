public class Solution {
    public void rotate(int[] nums, int k) {
        int[] nums_k = new int[k];
        int swap=0;
        
        if(k>nums.length)
            k=k%nums.length;
        
        for(int i=0; i<k; i++)
            nums_k[i]=nums[nums.length-k+i];
            
        for(int ii=nums.length-k-1; ii>=0; ii--){
            swap=nums[ii+k];
            nums[ii+k]=nums[ii];
            nums[ii]=swap;
        }
        
        for(int iii=0;iii<k;iii++)
            nums[iii]=nums_k[iii];
        
    }
}

/*
	Cut the input array into 2 parts, roll back the input array, insert the elements
*/