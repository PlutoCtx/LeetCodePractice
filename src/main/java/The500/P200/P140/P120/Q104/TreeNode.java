package The500.P200.P140.P120.Q104;

/**
 * LeetCodePractice
 * 树节点
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/1 21:22
 * @since JDK17
 */

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
