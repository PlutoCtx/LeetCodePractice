package A.work03;

/**
 * LeetCodePractice
 * 二叉树结点
 *
 * @author PlutoCtx
 * @version 2024/6/18 20:57
 * @email ctx195467@163.com
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


//public class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int x) {
//        val = x;
//    }
//}
