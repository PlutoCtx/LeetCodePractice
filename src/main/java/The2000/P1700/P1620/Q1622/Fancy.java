package The2000.P1700.P1620.Q1622;

/**
 * LeetCodePractice
 * 奇妙序列
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/6 16:15
 * @since JDK17
 */

public class Fancy {

    Node root;
    int mod = (int)1e9 + 7;
    int n = (int)1e5 + 1;
    int size = 0;

    public Fancy() {
        root = new Node(0, (int)1e5);
    }

    public void append(int val) {
        update(root, size, size, val);
        size++;
    }

    public void addAll(int inc) {
        update(root, 0, size - 1, inc);
    }

    public void multAll(int m) {
        update(root, 0, size - 1, -m);
    }

    public int getIndex(int idx) {
        return idx >= size ? -1 : query(root, idx, idx);
    }

    class Node {
        int left;
        int right;
        long val;
        long a;
        long b;
        Node leftNode;
        Node rightNode;

        public Node(int l, int r) {
            left = l;
            right = r;
            a = 1;
        }

        public Node getLeftNode() {
            if (leftNode == null) {
                leftNode = new Node(left, left + (right - left) / 2);
            }
            return leftNode;
        }

        public Node getRightNode() {
            if (rightNode == null) {
                rightNode = new Node(left + (right - left) / 2 + 1, right);
            }
            return rightNode;
        }
    }

    public void pushDown(Node node) {
        if (node.left < node.right && node.a > 1 || node.b > 0) {
            node.getLeftNode().val = (node.leftNode.val * node.a + node.b) % mod;
            node.leftNode.a = (node.leftNode.a * node.a) % mod;
            node.leftNode.b = (node.leftNode.b * node.a + node.b) % mod;
            node.getRightNode().val = (node.rightNode.val * node.a + node.b) % mod;
            node.rightNode.a = (node.rightNode.a * node.a) % mod;
            node.rightNode.b = (node.rightNode.b * node.a + node.b) % mod;
            node.a = 1;
            node.b = 0;
        }
    }

    public void update(Node node, int lo, int hi, int val) {
        if (node.left > hi || node.right < lo) {
            return;
        }
        if (node.left >= lo && node.right <= hi) {
            if (val > 0) {
                node.val = (node.val + val) % mod;
                node.b = (node.b + val) % mod;
            } else {
                node.val = (node.val * -val) % mod;
                node.a = (node.a * -val) % mod;
                node.b = (node.b * -val) % mod;
            }
            return;
        }
        pushDown(node);
        update(node.getLeftNode(), lo, hi, val);
        update(node.getRightNode(), lo, hi, val);
    }

    public int query(Node node, int lo, int hi) {
        if (node.left > hi || node.right < lo) {
            return 0;
        }
        if (node.left == lo && node.right == hi) {
            return (int)node.val;
        }
        pushDown(node);

        return query(node.getLeftNode(), lo, hi) + query(node.getRightNode(), lo, hi);
    }


}
