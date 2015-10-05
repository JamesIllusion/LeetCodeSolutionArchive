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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;
            
        TreeNode root = sortedArrayToBST(nums, 0, nums.length-1);
        
        return root;
    }
    
    private TreeNode sortedArrayToBST(int[] nums, int lo, int hi){
        if(lo>hi)
            return null;
            
        int mid = (lo+hi)/2;
        
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(nums, lo, mid-1);
        node.right = sortedArrayToBST(nums, mid+1, hi);
        
        return node;
    }
}

/*
	DFS-similar and binary search combine.
*/