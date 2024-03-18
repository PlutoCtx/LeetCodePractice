package The500.P300.P220.Q206;

/**
 * LeetCodePractice
 * 反转链表
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/15 9:58
 * @since JDK17
 */






public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode temp = new ListNode();
        temp = head.next.next;
        ListNode cur = new ListNode();
        ListNode pre = new ListNode();
        ListNode pos = new ListNode();
        ListNode res = new ListNode();

        while(temp.next != null) {
            pre = head.next;
            temp = pre.next;
            pre.next = head;
            head.next = null;
        }
        return pre;
    }
}




