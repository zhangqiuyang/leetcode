/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
/*Explanation:

The base case of the recursion is when the linked list is empty or has only one node. In this case, we return the head of the linked list.

In each step of the recursion, we reverse the next node first, then change the next pointer of the current node to point to the previous node.

The reverse linked list will start from the last node, which is returned as the result of the recursion.*/
