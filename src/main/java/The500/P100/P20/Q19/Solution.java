package The500.P100.P20.Q19;

/**
 * LeetCodePractice
 * 删除链表的倒数第 N 个结点
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/5 16:27
 * @since JDK17
 */

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode start = pre, end = pre;
        while(n != 0) {
            start = start.next;
            n--;
        }
        while(start.next != null) {
            start = start.next;
            end = end.next;
        }
        end.next = end.next.next;
        return pre.next;
    }


}
