package The500.P100.P40.Q23;

/**
 * LeetCodePractice
 * 合并K个升序链表
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/4 23:32
 * @since JDK17
 */

public class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return merge(lists, 0, lists.length - 1);
    }

    private ListNode merge(ListNode[] lists, int lo, int hi) {
        if (lo == hi) {
            return lists[lo];
        }
        int mid = lo + (hi - lo) / 2;
        ListNode l1 = merge(lists, lo, mid);
        ListNode l2 = merge(lists, mid + 1, hi);
//        return merge2Lists(l1, l2);
        return null;

    }


}
