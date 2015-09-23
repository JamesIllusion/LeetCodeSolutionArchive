/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null)
            return null;
            
        ListNode currA = headA;
        ListNode currB = headB;
        
        while(currA != currB){
            if(currA==null)
                currA = headB;
            else
                currA = currA.next;
                
            if(currB==null)
                currB = headA;
            else
                currB = currB.next;
        }
        
        return currA;
    }
}

/*
	Two pointer to start from each head. For each pointer, if it ends on the LinkedList, switch scan from
	the other head. Once two pointer hit, it is the intersection
*/