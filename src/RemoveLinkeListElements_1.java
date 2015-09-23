/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = new ListNode(0);
        
        curr.next = head;
        
        while(head!=null && head.val==val)
            head = head.next;
        while(curr!=null && curr.next!=null)
            if(curr.next.val==val)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        
        return head;
    }
}

/*
	Simple LinkedList operation, directly go through the LinkedList and when find the target, cut the pointer
*/