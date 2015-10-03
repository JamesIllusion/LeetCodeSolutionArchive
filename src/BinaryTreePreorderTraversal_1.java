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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> store = new Stack();
        
        store.push(root);
        
        while(!store.empty()){
            TreeNode node = store.pop();
            
            if(node!=null){
                res.add(node.val);
                store.push(node.right);
                store.push(node.left);
            }
            
        }
            

        return res;
    }
}

/*
	Straight forward from the definition. When root is not empty, append it to output array, and push right and then left into
	a stack. When there is no available node in tree, pop from stack and append to output array
*/