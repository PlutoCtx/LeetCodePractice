package The500.P300.P240.Q234;

/**
 * LeetCodePractice
 * 回文链表
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/4 23:41
 * @since JDK17
 */

public class Solution {

    public boolean isPalindrome(ListNode head) {
        //如果头为空或者链表就一个数，则为true
        if (head == null || head.next == null) {
            return true;
        }
        //slow慢指针，fast快指针，fast遍历到尾巴时，slow刚好到中间
        //pre和prepre作为反转前半链表的操作指针
        //pre紧贴slow，而prepre作为pre的next，即原链表中pre的前一个节点
        ListNode slow = head, fast = head;
        ListNode pre = head, prepre = null;
        //当fast节点遍历到尾巴或者遍历到尾巴的下一个（null）跳出
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
            //开始反转前半链表
            //先让在前的pre改变原指向后的链条，而去指向prepre，即pre的前一个节点，即反转
            //再让prepre在新的“前端”等待下一次反转
            pre.next = prepre;
            prepre = pre;
        }
        //当fast！=null，表示链表为奇数个，此时slow在中间，需要把slow往后移动一个到后半对称的开始
        if (fast != null) {
            slow = slow.next;
        }
        //此时，slow为后半链条的头，pre为前半链条的头，开始循环比较即可
        while (slow != null && pre != null) {
            if (slow.val != pre.val) {
                return false;
            }
            slow = slow.next;
            pre = pre.next;
        }
        return true;
    }

}
