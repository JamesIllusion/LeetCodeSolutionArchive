/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
            return false;
            
        ListNode one_step = head;
        ListNode two_steps = head;
        
        while(two_steps.next!=null && two_steps.next.next!=null){
            one_step = one_step.next;
            two_steps = two_steps.next.next;
            
            if(one_step==two_steps)
                return true;
        }
        
        return false;
        
    }
}

/*
	Two pointer, one goes 1 step each time, the other goes 2 steps. If there is a cycle, they would meet
	in the end. Or they will go to null.
*/