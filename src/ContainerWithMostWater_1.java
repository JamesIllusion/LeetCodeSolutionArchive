public class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int lo = 0, hi = height.length-1;
        
        while(lo<hi){
            max = Math.max(max, (hi-lo)*Math.min(height[lo], height[hi]));
            
            if(height[lo]>height[hi])
                hi--;
            else
                lo++;
        }
        
        
        return max;
    }
}

/*
	Two pointers from both ends. Move pointer with smaller value toward the other end
*/