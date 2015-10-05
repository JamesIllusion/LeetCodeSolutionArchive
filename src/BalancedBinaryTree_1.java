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
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        
//        if(root.left==null && root.right==null)
//            return true;
        
//        if(root.left==null && root.right!=null){
//            if(root.right.left!=null || root.right.right!=null)
//                return false;
//            else
//                return true;
//        }
        
//        if(root.left!=null && root.right==null){
//            if(root.left.left!=null || root.left.right!=null)
//                return false;
//            else
//                return true;
//        }
        
//        if(root.left!=null && root.right!=null)
//            return(isBalanced(root.left) && isBalanced(root.right));
//        return false;

        int leftDepth = treeDepth(root.left);
        int rightDepth = treeDepth(root.right);
        
        return Math.abs(leftDepth-rightDepth)<=1 && (isBalanced(root.left) && isBalanced(root.right));
            
    }
    
    private int treeDepth(TreeNode root){
        if(root==null)
            return 0;
        
        return Math.max(treeDepth(root.left), treeDepth(root.right))+1;
    }
}

/*
	Calculate depth of each sub-tree, using DFS, if depth from left and right is larger than 1, return false
*/