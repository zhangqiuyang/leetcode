class Solution {
    public ListNode deleteDuplicates(ListNode head) {
         ListNode move=head;
        while(move!=null && move.next!=null){
            if(move.next.val == move.val){
                move.next=move.next.next;
            }else{
                move=move.next;
            }
        }
        
        return head;
    }
}
