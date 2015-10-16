public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        
        if(matrix.length == 0)
            return res;
            
        int left = 0, top = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;
        
        while(left<=right && top <=bottom){
            for(int i=left; i<=right; i++)
                res.add(matrix[top][i]);
            top++;
            
            for(int i=top; i<=bottom; i++)
                res.add(matrix[i][right]);
            right--;
            
            if(top<=bottom){
                for(int i=right; i>=left; i--)
                    res.add(matrix[bottom][i]);
                bottom--;
            }
            
            if(left<=right){
                for(int i=bottom; i>=top; i--)
                    res.add(matrix[i][left]);
                left++;
            }
        }
        return res;
    }
}

/*
	Straight forward solution. Use ArrayList as container, starting from top, and then right, bottom, and left. During this process,
	boudaries are closing to center.
	PS. be careful of judging condition
	PS2. Similar to MatrixRotation
*/