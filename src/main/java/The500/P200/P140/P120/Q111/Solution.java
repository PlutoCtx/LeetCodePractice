package The500.P200.P140.P120.Q111;

/**
 * LeetCodePractice
 * 二叉树的最小深度
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/1 21:28
 * @since JDK17
 */

class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int min_depth = Integer.MAX_VALUE;
        if (root.left != null) {
            min_depth = Math.min(minDepth(root.left), min_depth);
        }
        if (root.right != null) {
            min_depth = Math.min(minDepth(root.right), min_depth);
        }

        return min_depth + 1;
    }


}

