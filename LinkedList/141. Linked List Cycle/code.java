public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        if(head.next == head) return true;
        ListNode slow = head , fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
    }
}
