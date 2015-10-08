public class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int lo = 0, hi = height.length-1;
        
        while(lo<hi){
            if(height[lo]<height[hi]){
                int area = (hi-lo)*height[lo];
                max = max>area ? max : area;
                lo++;
            }
            else{
                int area = (hi-lo)*height[hi];
                max = max>area ? max : area;
                hi--;
            }
        }
        
        
        return max;
    }
}

/*
	Two pointers from both ends. Move pointer with smaller value toward the other end
*/