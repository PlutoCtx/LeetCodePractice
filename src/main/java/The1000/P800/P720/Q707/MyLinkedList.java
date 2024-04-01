package The1000.P800.P720.Q707;

/**
 * LeetCodePractice
 * 设计链表
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/1 21:59
 * @since JDK17
 */

class MyLinkedList {
    class Node {
        Node prev, next;
        int val;
        Node (int _val) {
            val = _val;
        }
    }
    Node he = new Node(-1), ta = new Node(-1);
    int sz = 0;
    public MyLinkedList() {
        he.next = ta; ta.prev = he;
    }
    public int get(int index) {
        Node node = getNode(index);
        return node == null ? -1 : node.val;
    }
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = he.next; node.prev = he;
        he.next.prev = node; he.next = node;
        sz++;
    }
    public void addAtTail(int val) {
        Node node = new Node(val);
        node.prev = ta.prev; node.next = ta;
        ta.prev.next = node; ta.prev = node;
        sz++;
    }
    public void addAtIndex(int index, int val) {
        if (index > sz) {
            return ;
        }
        if (index <= 0) {
            addAtHead(val);
        } else if (index == sz) {
            addAtTail(val);
        } else {
            Node node = new Node(val), cur = getNode(index);
            node.next = cur; node.prev = cur.prev;
            cur.prev.next = node; cur.prev = node;
            sz++;
        }
    }
    public void deleteAtIndex(int index) {
        Node cur = getNode(index);
        if (cur == null) {
            return ;
        }
        cur.next.prev = cur.prev;
        cur.prev.next = cur.next;
        sz--;
    }
    Node getNode(int index) {
        boolean isLeft = index < sz / 2;
        if (!isLeft) {
            index = sz - index - 1;
        }
        for (Node cur = isLeft ? he.next : ta.prev; cur != ta && cur != he; cur = isLeft ? cur.next : cur.prev) {
            if (index-- == 0) {
                return cur;
            }
        }
        return null;
    }
}


