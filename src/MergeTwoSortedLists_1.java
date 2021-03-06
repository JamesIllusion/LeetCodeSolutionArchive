/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null && l2==null)
            return null;
        if(l1==null && l2!=null)
            return l2;
        if(l1!=null && l2==null)
            return l1;
            
        ListNode lm;
//        while(l1!=null || l2!=null){
            if(l1.val <= l2.val){
                lm = l1;
                lm.next = mergeTwoLists(l1.next, l2);
            }
            else{
                lm = l2;
                lm.next = mergeTwoLists(l1, l2.next);
            }
            
//        }
        
        return lm;
        
    }
}

/*
	MergeSort algorithm using LinkedList
*/