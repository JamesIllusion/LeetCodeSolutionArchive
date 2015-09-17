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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q)
            return root;
            
        TreeNode left = lowestCommonAncestor(root.left, TreeNode p, TreeNode q);
        TreeNode right = lowestCommonAncestor(root.right, TreeNode p, TreeNode q);
        
        if(left!=null && right!=null)
            return root;
            
        if(left==null)
            return right;
        if(right==null)
            return left;
            
        return null;
    }
}