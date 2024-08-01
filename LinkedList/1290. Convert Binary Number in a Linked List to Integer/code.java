class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode rev = reverse(head);
        int num = 0 , i = 0;
        while(rev != null){
            num += rev.val * Math.pow(2 , i ++);
            rev = rev.next;
        } 
        return num;
    }
    ListNode reverse(ListNode head) {
        // Base case: if head is null or only one node, return head
        if (head == null || head.next == null) return head;
        // Reverse the rest list and put the first element at the end
        ListNode newHead = reverse(head.next);
        // Change the next of next node to point to the current node
        head.next.next = head;
        // This is the point where the current node should point to null
        head.next = null;
        // newHead now points to the reversed list
        return newHead;
    }
}
