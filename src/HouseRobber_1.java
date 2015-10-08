public class Solution {
    public int rob(int[] nums) {
        int noRob=0, rob=0;
        
        for(int i=0; i<nums.length; i++){
            int temp = noRob;
            noRob = rob>noRob ? rob:noRob;
            rob = temp+nums[i];
        }
        return Math.max(rob, noRob);
    }
}

/*
	When access to a new node, there are two status for previous node - rob / noRob, save noRob as temp. And then calculate for 
	current node. if not rob current node, save noRob from bigger one - rob / noRob; and if rob, then it must be noRob from previous
	node, which leads rob=temp+current node.
	Finally, compare rob and noRob, take bigger one.
*/