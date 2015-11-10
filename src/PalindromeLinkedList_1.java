/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
            return true;
            
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode FirstHalf = head;
        ListNode SecondHalf = FirstHalf.next;
        ListNode fast = head;
        
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            
            start = FirstHalf;
            FirstHalf = SecondHalf;
            SecondHalf = SecondHalf.next;
            FirstHalf.next = start;
        }
        
        if(fast.next==null)
            FirstHalf = FirstHalf.next;
            
        while(SecondHalf!=null){
            if(FirstHalf.val != SecondHalf.val)
                return false;
            FirstHalf = FirstHalf.next;
            SecondHalf = SecondHalf.next;
        }
        
        return true;
    }
}

/*
	Reverse the first part of the linked list, then start compare the first and second part (from beginning and middle point)
	If there is any difference, then it is not palindrome
*/