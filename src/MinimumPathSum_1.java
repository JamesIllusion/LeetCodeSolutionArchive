public class Solution {
    public int minPathSum(int[][] grid) {
//        int sum = 0;
        
        for(int i=0; i<grid.length; i++)
            for(int j=0; j<grid[0].length; j++){
                if(i==0 && j==0)
                    grid[i][j] = grid[i][j];
                else if(i==0 && j!=0)
                    grid[i][j] = grid[i][j-1] + grid[i][j];
                else if(i!=0 && j==0)
                    grid[i][j] = grid[i-1][j] + grid[i][j];
                else
                    grid[i][j] = Math.min(grid[i][j-1], grid[i-1][j]) + grid[i][j];
            }
            
            return grid[grid.length-1][grid[0].length-1];
        
//        return sum;
    }
}

/*
	Typical dynamic programming issue, for each node a[i][j], it comes from either a[i-1][j] or a[i][j-1]]
	PS. be careful of array boundary
*/