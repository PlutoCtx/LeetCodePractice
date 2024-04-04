package The500.P200.P160.Q141;

/**
 * LeetCodePractice
 * 环形链表
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/4 23:43
 * @since JDK17
 */

public class Solution {

    public boolean hasCycle(ListNode head) {
        if (head == null){
            return false;
        }
        if (head.next == null){
            return false;
        }
        ListNode slowNode = head;
        ListNode fastSlowNode = head.next;
        while (fastSlowNode.next != null){
            if (slowNode == fastSlowNode){
                return true;
            }
            slowNode = slowNode.next;
            if (fastSlowNode.next.next == null){
                return false;
            }else {
                fastSlowNode = fastSlowNode.next.next;
            }
        }
        return false;
    }

}
