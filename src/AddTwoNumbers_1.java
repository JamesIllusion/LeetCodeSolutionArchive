/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode result_head = result;
        int sum = 0;
        
        while(l1!=null || l2!=null){
            sum /=10;
            
            if(l1!=null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum += l2.val;
                l2 = l2.next;
            }
            
            result.next = new ListNode(sum%10);
            result = result.next;
        }
        if(sum>=10)
            result.next = new ListNode(1);
        
        return result_head.next;
    }
}

/*
	Straight forward solution. Add corresponding digits from both LinkedList together. If it carries over 
	then initialize a new Node with value of 1.
*/