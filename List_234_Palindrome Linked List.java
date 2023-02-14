/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    public boolean isPalindrome(ListNode head) {
       if(head==null || head.next==null){
        return true;
    }
    ListNode slow = head, fast = head.next;
    while(fast!=null&&fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
    }
    ListNode pre=slow.next;
    slow.next=null;
    ListNode rev=null;
    while(pre!=null){
        ListNode next=pre.next;
        pre.next=rev;
        rev=pre;
        pre=next;
    }
    while(head!=null&&rev!=null){
        if(head.val!=rev.val) return false;
        head=head.next;
        rev=rev.next;
    }  
    return true;  
}
}
