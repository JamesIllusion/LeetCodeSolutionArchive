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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> store = new Stack<TreeNode>();
        
        TreeNode node = root;
        
        while(node!=null || !store.empty()){
            while(node!=null){
                store.push(node);
                node = node.left;
            }
            node = store.pop();
            res.add(node.val);
            node = node.right;
        }
        return res;
    }
}

/*
	When node is not null, push it to stack, and keep check the left child. when node is null, start pop from stack, and check 
	the right child.
*/