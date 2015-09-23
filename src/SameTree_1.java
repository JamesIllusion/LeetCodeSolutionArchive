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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // base case
        if(p==null || q==null) return p==null && q==null;
        // recursion
        return p.val==q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }
}

/*
	DFS algorithm application, all left and right subtrees should be same
*/