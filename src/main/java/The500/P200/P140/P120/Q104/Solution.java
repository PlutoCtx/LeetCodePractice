package The500.P200.P140.P120.Q104;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCodePractice
 * 二叉树的最大深度
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/1 21:21
 * @since JDK17
 */


class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int ans = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                size--;
            }
            ans++;
        }
        return ans;
    }
}

