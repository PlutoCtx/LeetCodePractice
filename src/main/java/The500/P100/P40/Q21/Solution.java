package The500.P100.P40.Q21;

/**
 * LeetCodePractice
 * 合并两个有序链表
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/1 0:13
 * @since JDK17
 */

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }
}


