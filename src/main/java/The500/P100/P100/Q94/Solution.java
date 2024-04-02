package The500.P100.P100.Q94;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCodePractice
 * 二叉树的中序遍历
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/2 10:40
 * @since JDK17
 */

public class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        dfs(res,root);
        return res;
    }

    void dfs(List<Integer> res, TreeNode root) {
        if(root==null) {
            return;
        }
        //按照 左-打印-右的方式遍历
        dfs(res,root.left);
        res.add(root.val);
        dfs(res,root.right);
    }



}
