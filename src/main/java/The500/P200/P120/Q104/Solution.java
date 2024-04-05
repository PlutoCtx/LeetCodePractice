package The500.P200.P120.Q104;

import java.util.LinkedList;
import java.util.List;

/**
 * LeetCodePractice
 * 二叉树的最大深度
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/5 16:45
 * @since JDK17
 */

public class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        List<TreeNode> queue = new LinkedList<>() {{ add(root); }}, tmp;
        int res = 0;
        while (!queue.isEmpty()) {
            tmp = new LinkedList<>();
            for(TreeNode node : queue) {
                if (node.left != null) {
                    tmp.add(node.left);
                }
                if (node.right != null) {
                    tmp.add(node.right);
                }
            }
            queue = tmp;
            res++;
        }
        return res;
    }



}
