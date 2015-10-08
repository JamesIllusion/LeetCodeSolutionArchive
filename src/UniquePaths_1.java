public class Solution {
    public int uniquePaths(int m, int n) {
        if(n>m)
            return uniquePaths(n,m);
            
        int[][] path = new int[m][n];
        
        for(int i=0; i<m; i++)
            path[i][0] = 1;
        for(int i=0; i<n; i++)
            path[0][i] = 1;
            
        for(int i=1; i<m; i++)
            for(int j=1; j<n; j++)
                path[i][j] = path[i-1][j] + path[i][j-1];
                
        return path[m-1][n-1];
    }
}

/*
	Dynamic Programming solution. For every single node, there are only 1 path from the point on its left or upside. And for all
	the node at the 1st column or 1st row, there is only 1 path. Put them together using a board like matrix.
*/

/*
	Solution2, math solution. Since there are only 'going down' and 'going right' two direction, it can be calculated by combination
	C(m-1)(m+n-2) / C(n-1)(m+n-2)
*/