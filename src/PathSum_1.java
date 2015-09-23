/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
            return false;
        if(root.left==null && root.right==null){
            if(root.val!=sum)
                return false;
            else 
                return true;
        }
        
            return(hasPathSum(root.left,(sum-root.val)) || hasPathSum(root.right,(sum-root.val)));
        
        //return false;
    }
}

/*
	DFS application solution. Read from root, and for each left or right tree, try to find (sum-root.val)
*/