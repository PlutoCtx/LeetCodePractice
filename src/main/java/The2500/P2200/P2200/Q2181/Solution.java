package The2500.P2200.P2200.Q2181;

import java.util.List;

/**
 * LeetCodePractice
 * 合并零之间的节点
 *
 * @author PlutoCtx    ctx195467@163.com
 * @version 2024/9/9 9:49
 * @since JDK17
 */

public class Solution {

    public ListNode mergeNodes(ListNode head) {
        ListNode hNode = new ListNode();
        int temp = 0;
        ListNode tail = hNode;

        for (ListNode cur = head.next; cur != null; cur = cur.next) {
            if (cur.val != 0) {
                temp += cur.val;
            } else {
                tail.next = new ListNode(temp);
                tail = tail.next;
                temp = 0;
            }
        }
        return hNode.next;












//        ListNode res = new ListNode();
//        ListNode resNext = res;
//        int temp = 0;
//
////        while (head != null) {
////            System.out.print(head.val + "\t");
////            head = head.next;
////        }
////        System.out.println();
////        System.out.println("********************************");
//        while (head != null) {
////            System.out.println(head.val);
//            if (head.val != 0) {
//                temp += head.val;
//            } else {
//                resNext.next = new ListNode(temp);
//                resNext = resNext.next;
////                System.out.println(temp);
////                ListNode tmp = new ListNode(temp);
////                res.next = tmp;
////                res = res.next;
//                temp = 0;
//            }
//            head = head.next;
//        }
//
//        while (res != null) {
//            System.out.println(res.val);
//            res = res.next;
//        }
//
//
//
////        while (head.next != null) {
////            if (head.val != 0) {
////                temp += head.val;
////                head = head.next;
////            } else {
////                System.out.println(temp);
//////                ListNode tmp = new ListNode(temp);
//////                res.next = tmp;
//////                res.val = temp;
//////
//////                temp = 0;
////            }
////        }
//
//        return res.next;










    }




















}
