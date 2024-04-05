package The500.P200.P160.Q142;

/**
 * LeetCodePractice
 * 环形链表 II
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/5 16:29
 * @since JDK17
 */

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

}
