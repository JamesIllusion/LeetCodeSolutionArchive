public class Solution {
    public int[][] generateMatrix(int n) {
        if(n==0)
            return new int[0][0];
        
        int left = 0, top = 0;
        int right = n-1, bottom = n-1;
        
        int[][] res = new int[n][n];
        int loc = 1;
        
        while(left<=right && top<=bottom){
            for(int i=left; i<=right; i++)
                res[top][i] = loc++;
            top++;
            
            for(int i=top; i<=bottom; i++)
                res[i][right] = loc++;
            right--;
            
            if(top<=bottom){
                for(int i=right; i>=left; i--)
                    res[bottom][i] = loc++;
                bottom--;
            }
            
            if(left<=right){
                for(int i=bottom; i>=top; i--)
                    res[i][left] = loc++;
                left++;
            }
        }
        return res;
    }
}

/*
	Similar idea to Sprial Matrix I, be careful of the boundary
*/