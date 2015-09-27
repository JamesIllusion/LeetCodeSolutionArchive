public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        int lo = 0, hi = row*col-1;
        
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            int mid_val = matrix[mid/col][mid%col];
            
            if(mid_val==target)
                return true;
            
            if(mid_val<target)
                lo=mid+1;
            else
                hi=mid-1;
        }
        return false;
    }
}

/*
	BinarySearch method. Start from mid, and check condition
*/