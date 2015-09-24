/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode fake = new ListNode(0);
        fake.next = head;
        ListNode curr = fake;
        
        if(head==null || head.next==null)
            return head;
        
        while(curr.next!=null && curr.next.next!=null){
            ListNode tmp_1 = curr.next;
            ListNode tmp_2 = curr.next.next;
            
            tmp_1.next = tmp_1.next.next;
            tmp_2.next = tmp_1;
            curr.next = tmp_2;
            
            curr = curr.next.next;
        }
        
        return fake.next;
    }
}

/*
	Constant space complexity. Straight forward solution. Disconnect and reconnect element in LinkedList
*/