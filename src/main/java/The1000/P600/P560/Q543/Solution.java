package The1000.P600.P560.Q543;

/**
 * LeetCodePractice
 * 二叉树的直径
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/5 16:42
 * @since JDK17
 */

public class Solution {

    private int ans;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return ans;
    }

    private int dfs(TreeNode node) {
        if (node == null){
            // 下面 +1 后，对于叶子节点就刚好是 0
            return -1;
        }
        // 左子树最大链长+1
        int lLen = dfs(node.left) + 1;
        // 右子树最大链长+1
        int rLen = dfs(node.right) + 1;
        // 两条链拼成路径
        ans = Math.max(ans, lLen + rLen);
        // 当前子树最大链长
        return Math.max(lLen, rLen);
    }



}
