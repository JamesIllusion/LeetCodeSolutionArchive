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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
            
        return isSymmetric_lr(root.left, root.right);
    }
    
    boolean isSymmetric_lr(TreeNode left, TreeNode right){
        if(left==null || right==null)
            return left==right;
            
        if(left.val!=right.val)
            return false;
            
        return isSymmetric_lr(left.right, right.left) && isSymmetric_lr(left.left, right.right);
    }
}

/*
	Recursive soluition. check from both left and right sub-tree, and sub-tree from each sub-tree
*/