class Solution {
    ListNode head1;
    public boolean isPalindrome(ListNode head) {
       if(head==null || head.next==null){
        return true;
    }
    head1=head;
    return palin(head); 
    }
    private boolean palin(ListNode last) {
    if (last.next == null) {
        return last.val == head1.val;
    }
    boolean val = palin(last.next);
    if (!val) {
        return val;
    }
    head1 = head1.next;
    val = head1.val == last.val;
    return val;
}
}
