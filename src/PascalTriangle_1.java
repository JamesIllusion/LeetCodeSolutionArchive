public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        
        
        for (int i=0; i<numRows; i++){
            List<Integer> row =  new ArrayList<Integer>();
            
            for (int j=0; j<i+1; j++){
                if (j==0 || j==i)
                    row.add(j,1);
                else
                    row.add(j,triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
            }
            triangle.add(row);
        }
        return triangle;
    }
}

/*
	Straight forward solution. For each row, the first and the last element must be 1. And each other elements
	equal to sum of corresponding elements in previous row.
*/