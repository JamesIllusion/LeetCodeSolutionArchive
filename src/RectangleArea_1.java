public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area_1 = 0, area_2 = 0;
        int area_overlap = 0;
        
        area_1 = (C-A)*(D-B);
        area_2 = (G-E)*(H-F);
        
        int left = Math.max(A,E);
        int right = Math.min(C,G);
        int up = Math.min(D,H);
        int down = Math.max(B,F);
        
        if(left<right && up>down)
            area_overlap = (right-left)*(up-down);
            
        return area_1+area_2-area_overlap;
    }
}

/*
	Straight forward solution. Calculate both area and exclueds overlap area.
*/