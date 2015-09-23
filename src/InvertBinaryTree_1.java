/**
 * Definition for a binary root node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return root;
        
        TreeNode left = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(left);
        
        return root;
	}
}

/*
	Straight forward solution. Recursively change from left to right
*/