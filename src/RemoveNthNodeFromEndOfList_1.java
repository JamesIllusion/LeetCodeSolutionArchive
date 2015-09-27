/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return head;
        
        ListNode fake = new ListNode(0);
        fake.next = head;
        ListNode first = fake, second = fake;
        
        for(int i=0; i<n; i++)
            first = first.next;
            
        while(first.next!=null){
            first = first.next;
            second = second.next;
        }
        
        second.next = second.next.next;
        
        return fake.next;
    }
}

/*
	Two pointers. Move first pointer to make N space between two pointers, and then both move forward. When the first pointer hits
	the end of the LinkedList, the second pointer is going to remove the next element.
*/