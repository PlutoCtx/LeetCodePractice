package A.work01;

/**
 * LeetCodePractice
 * 约瑟夫环问题
 * 循环单链表求解
 * 循环队列求解
 *
 * @see <a href="https://leetcode.cn/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof/">约瑟夫环问题</a> *
 * @author PlutoCtx
 * @version 2024/6/15 22:44
 * @email ctx195467@163.com
 * @since JDK17
 */



public class Joseph {

    // 定义链表节点
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    // 求解约瑟夫问题的函数
    static void josephus(int n, int m) {
        if (n <= 0 || m <= 0) {
            System.out.println("输入错误：n和m必须大于0");
            return;
        }

        // 创建循环单链表
        Node head = null, prev = null;
        for (int i = 1; i <= n; i++) {
            Node newNode = new Node(i);
            if (head == null) {
                head = newNode;
                prev = newNode;
            } else {
                prev.next = newNode;
                prev = newNode;
            }
        }
        // 链表形成闭环
        prev.next = head;

        // 模拟报数和出局过程
        Node current = head;
        Node prevNode = null;
        // 链表中至少有两个节点时循环
        while (current.next != current) {
            for (int count = 1; count < m; count++) {
                prevNode = current;
                current = current.next;
            }
            // 报数到m的节点出局
            prevNode.next = current.next;
            System.out.print(current.value + " ");
            current = prevNode.next;
        }
        // 最后只剩下一个节点
        System.out.print(current.value);
        System.out.println();
    }

    public static void main(String[] args) {
        // 测试n = 9, m = 5
        System.out.println("n = 9, m = 5: ");
        josephus(9, 5);
        System.out.println();

        // 测试n = 9, m = 0（通常m应该大于0，这里作为错误处理测试）
        System.out.println("n = 9, m = 0: ");
        josephus(9, 0);
        System.out.println();

        // 测试n = 9, m = 10（m可以大于n，程序依然能正常工作）
        System.out.println("n = 9, m = 10: ");
        josephus(9, 10);
        System.out.println();


        // 测试n = 41, m = 3
        System.out.println("n = 41, m = 3: ");
        josephus(41, 3);
    }

//    public static void main(String[] args) {
//        //解决约瑟夫问题
//        new Joseph().solveJoseph(41, 3);
//    }
//
//
//
//
//
//    public void solveJoseph(int n, int m) {
//
//        //1.构建循环链表，包含41个结点，分别储存1-41之间的值
//        //首结点
//        Node<Integer> first = null;
//        //记录前一个结点
//        Node<Integer> pre = null;
//        for(int i = 1; i < n + 1; i++){
//            //如果是第一个结点
//            if(i == 1){
//                first = new Node<>(i, null);
//                pre = first;
//                continue;
//            }
//            //如果不是第一个结点
//            Node<Integer> newNode = new Node<>(i, null);
//            pre.next = newNode;
//            pre = newNode;
//            // 如果是最后一个结点，那么需要最后一个结点的下一个结点指向first,变为循环链表
//            if(i == m){
//                pre.next = first;
//            }
//        }
//        //2.需要count计数器，模拟报数
//        int count = 0;
//
//        //3.遍历循环链表
//        Node<Integer> cur = first;
//        Node<Integer> pre2 = null;
//        while(cur != cur.next){
//            // 模拟报数
//            count ++;
//            if (count == n) {
//                //删除当前节点
//                pre2.next = cur.next;
//                System.out.print(cur.data + ",");
//                count = 0;
//                cur = cur.next;
//            } else {
//                pre2 = cur;
//                cur = cur.next;
//            }
//        }
//
//        // 打印最后一个元素
//        System.out.println(cur.data);
//
//    }
//
//
//
//
//    //结点类
//    public static class Node<T>{
//        private T data;
//        private Node next;
//
//        public Node(T data, Node next){
//            this.data = data;
//            this.next = next;
//        }
//    }

}


//// 定义链表节点
//class Node{
//    int date;
//    Node next;
//
//    public Node(int date) {
//        this.date = date;
//    }
//}
//
//
//public class Joseph {
//
//
//    /**
//     * 环形链表求解约瑟夫环
//     * @param n 总人数
//     * @param m 每次报数的数字
//     * @return      最后存活的人
//     */
//    public static int solve(int n, int m) {
//        Logger.getGlobal().info("环形链表求解");
//        if(m == 1 || n < 2) {
//            return n;
//        }
//        // 创建环形链表
//        Node head = createLinkedList(n);
//        // 遍历删除
//        int count = 1;
//        Node cur = head;
//        // 前驱节点
//        Node pre = null;
//        while (head.next != head) {
//            // 删除节点
//            if (count == m) {
//                count = 1;
////                System.out.println("删除节点：" + cur.date);
//                pre.next = cur.next;
//                cur = pre.next;
//            } else {
//                count++;
////                System.out.println("当前节点：" + cur.date);
//                pre = cur;
//                cur = cur.next;
//            }
//        }
//        Logger.getGlobal().info("返回最后存活的人：" + cur.date);
//        return head.date;
//    }
//
//    /**
//     * 创建环形链表
//     * @param n 总人数
//     * @return  头节点
//     */
//    static Node createLinkedList(int n) {
//        Logger.getGlobal().info("创建环形链表");
//        Node head = new Node(1);
//        Node next = head;
//        for (int i = 2; i <= n; i++) {
//            Node tempNode = new Node(i);
//            next.next = tempNode;
//            next = next.next;
//        }
//        // 头尾串联
//        next.next = head;
//        Logger.getGlobal().info("环形链表创建完成");
//        return head;
//    }
//
//
//    public static void main(String[] args) {
//        int solve = Joseph.solve(7, 3);
//        System.out.println("最后存活的人：" + solve);
//
//
//    }
//
//
//
//
//
//}
