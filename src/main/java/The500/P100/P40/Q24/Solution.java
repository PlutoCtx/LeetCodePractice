package The500.P100.P40.Q24;

/**
 * LeetCodePractice
 * 两两交换链表中的节点
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/5 16:25
 * @since JDK17
 */

public class Solution {

    public ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        while(temp.next != null && temp.next.next != null) {
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return pre.next;
    }


}
