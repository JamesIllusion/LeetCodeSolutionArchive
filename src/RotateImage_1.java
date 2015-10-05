public class Solution {
    public void rotate(int[][] matrix) {
        int loc = matrix.length-1;
        for(int i=0; i<matrix.length; i++)
            for(int j=i; j<matrix.length-i-1; j++){
                int temp = matrix[j][loc-i];
                matrix[j][loc-i] = matrix[i][j];
                matrix[i][j] = matrix[loc-j][i];
                matrix[loc-j][i] = matrix[loc-i][loc-j];
                matrix[loc-i][loc-j] = temp;
                
            }
    }
}

/*
	Straight foward solution. In place exchange element.
*/