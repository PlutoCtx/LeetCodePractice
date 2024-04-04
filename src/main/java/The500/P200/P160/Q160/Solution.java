package The500.P200.P160.Q160;

/**
 * LeetCodePractice
 * 相交链表
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/4 23:39
 * @since JDK17
 */

public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }

}
