package A.work03;

import java.util.Stack;

/**
 * LeetCodePractice
 * 构造二叉树
 *
 * @author PlutoCtx
 * @version 2024/6/18 20:58
 * @email ctx195467@163.com
 * @since JDK17
 */


public class BinaryTree {


    /**
     * 构造二叉树
     * @param preorder  先序
     * @param inorder   中序
     * @return  二叉树根节点
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        Stack<TreeNode> roots = new Stack<TreeNode>();
        int pre = 0;
        int in = 0;
        //先序遍历第一个值作为根节点
        TreeNode curRoot = new TreeNode(preorder[pre]);
        TreeNode root = curRoot;
        roots.push(curRoot);
        pre++;
        //遍历前序遍历的数组
        while (pre < preorder.length) {
            //出现了当前节点的值和中序遍历数组的值相等，寻找是谁的右子树
            if (curRoot.val == inorder[in]) {
                //每次进行出栈，实现倒着遍历
                while (!roots.isEmpty() && roots.peek().val == inorder[in]) {
                    curRoot = roots.peek();
                    roots.pop();
                    in++;
                }
                //设为当前的右孩子
                curRoot.right = new TreeNode(preorder[pre]);
                //更新 curRoot
                curRoot = curRoot.right;
                roots.push(curRoot);
                pre++;
            } else {
                //否则的话就一直作为左子树
                curRoot.left = new TreeNode(preorder[pre]);
                curRoot = curRoot.left;
                roots.push(curRoot);
                pre++;
            }
        }
        return root;
    }


    /**
     * 是否镜像
     * @param root  根节点
     * @return  是/否
     */
    public boolean isSymmetric(TreeNode root) {
        return isSameTree(root.left, root.right);
    }


    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }
        return p.val == q.val && isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
    }


    public static void main(String[] args) {



        BinaryTree checker = new BinaryTree();

        // 构建一个对称二叉树
        int[] preorder = {1, 2, 3, 4, 2, 4, 3};
        int[] inorder = {3, 2, 4, 1, 4, 2, 3};
        TreeNode root = checker.buildTree(preorder, inorder);

        // 检验是否为镜像二叉树
        // 应该输出 true
        System.out.println("是否为镜像二叉树? " + checker.isSymmetric(root));

        // 构建一个非对称二叉树
        preorder = new int[]{1, 2, 4, 5, 3, 6, 7};
        inorder = new int[]{4, 2, 5, 1, 6, 3, 7};
        root = checker.buildTree(preorder, inorder);

        // 检验是否为镜像二叉树
        // 应该输出 false
        System.out.println("是否为镜像二叉树? " + checker.isSymmetric(root));

    }










//    // 辅助方法：判断两棵树是否为镜像
//    public boolean isMirror(TreeNode t1, TreeNode t2) {
//        // 如果两个节点都为空，那么它们是镜像的
//        if (t1 == null && t2 == null) {
//            return true;
//        }
//        // 如果只有一个节点为空，或者节点的值不相等，那么它们不是镜像的
//        if (t1 == null || t2 == null || t1.val != t2.val) {
//            return false;
//        }
//        // 递归地检查节点的左右子树是否镜像
//        return isMirror(t1.right, t2.left) && isMirror(t1.left, t2.right);
//    }
//
//    // 主方法：判断一棵二叉树是否为镜像
//    public boolean isSymmetric(TreeNode root) {
//        // 如果根节点为空，那么空树是镜像的
//        if (root == null) {
//            return true;
//        }
//        // 检查根节点的左右子树是否镜像
//        return isMirror(root.left, root.right);
//    }
//
//    // 辅助方法：构建二叉树
//    public TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
//        if (preStart > preEnd || inStart > inEnd) {
//            return null;
//        }
//
//        // 先序遍历的第一个节点是根节点
//        TreeNode root = new TreeNode(preorder[preStart]);
//
//        // 在中序遍历中找到根节点的索引
//        int rootIndex = -1;
//        for (int i = inStart; i <= inEnd; i++) {
//            if (inorder[i] == root.val) {
//                rootIndex = i;
//                break;
//            }
//        }
//
//        // 递归构造左右子树
//        int leftSubtreeSize = rootIndex - inStart + 1;
//        root.left = buildTree(preorder, preStart + 1, preStart + leftSubtreeSize, inorder, inStart, rootIndex - 1);
//        root.right = buildTree(preorder, preStart + leftSubtreeSize + 1, preEnd, inorder, rootIndex + 1, inEnd);
//
//        return root;
//    }
//
//    // 测试方法
//    public static void main(String[] args) {
//        BinaryTree checker = new BinaryTree();
//
//        // 构建一个对称二叉树
//        int[] preorder = {1, 2, 2, 3, 4, 4, 3};
//        int[] inorder = {2, 4, 2, 3, 1, 3, 4};
//        TreeNode root = checker.buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
//
//        // 检验是否为镜像二叉树
//        System.out.println("Is tree symmetric? " + checker.isSymmetric(root)); // 应该输出 true
//
//        // 构建一个非对称二叉树
//        preorder = new int[]{1, 2, 4, 5, 3, 6, 7};
//        inorder = new int[]{4, 2, 5, 1, 6, 3, 7};
//        root = checker.buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
//
//        // 检验是否为镜像二叉树
//        System.out.println("Is tree symmetric? " + checker.isSymmetric(root)); // 应该输出 false
//    }
}

//public class BinaryTree {
//
////    // 构造二叉树（使用先序遍历和中序遍历）
////    public TreeNode buildTree(int[] preorder, int[] inorder) {
////        if (preorder == null || inorder == null || preorder.length != inorder.length) {
////            return null;
////        }
////        return buildTreeHelper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
////    }
////
////    private TreeNode buildTreeHelper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
////        if (preStart > preEnd || inStart > inEnd) {
////            return null;
////        }
////
////        // 先序遍历的第一个节点是根节点
////        TreeNode root = new TreeNode(preorder[preStart]);
////
////        // 在中序遍历中找到根节点的索引
////        int rootIndex = -1;
////        for (int i = inStart; i <= inEnd; i++) {
////            if (inorder[i] == root.val) {
////                rootIndex = i;
////                break;
////            }
////        }
////
////        // 判断根节点是否位于中序遍历序列中间
////        if (rootIndex == inStart && rootIndex == inEnd) {
////            int leftSubtreeSize = inEnd - inStart;
////            root.left = buildTreeHelper(preorder, preStart + 1, preStart + leftSubtreeSize, inorder, inStart, inEnd - 1);
////            root.right = null;
////        } else if (rootIndex == inStart) {
////            int leftSubtreeSize = rootIndex - inStart;
////            root.left = buildTreeHelper(preorder, preStart + 1, preStart + leftSubtreeSize, inorder, inStart, rootIndex - 1);
////            root.right = buildTreeHelper(preorder, preStart + leftSubtreeSize + 1, preEnd, inorder, rootIndex + 1, inEnd);
////        } else if (rootIndex == inEnd) {
////            int leftSubtreeSize = rootIndex - inStart;
////            int rightSubtreeSize = inEnd - rootIndex;
////            root.right = buildTreeHelper(preorder, preStart + leftSubtreeSize + 1, preEnd, inorder, rootIndex + 1, inEnd);
////            root.left = buildTreeHelper(preorder, preStart + 1, preStart + leftSubtreeSize, inorder, inStart, rootIndex - 1);
////        } else {
////            int leftSubtreeSize = rootIndex - inStart;
////            int rightSubtreeSize = inEnd - rootIndex;
////            root.left = buildTreeHelper(preorder, preStart + 1, preStart + leftSubtreeSize, inorder, inStart, rootIndex - 1);
////            root.right = buildTreeHelper(preorder, preStart + leftSubtreeSize + 1, preEnd, inorder, rootIndex + 1, inEnd);
////        }
////
////        return root;
//////        for (int i = inStart; i <= inEnd; i++) {
//////            if (inorder[i] == root.val) {
//////                rootIndex = i;
//////                break;
//////            }
//////        }
//////
//////        // 递归构造左右子树
//////        int leftSubtreeSize = rootIndex - inStart;
//////        root.left = buildTreeHelper(preorder, preStart + 1, preStart + leftSubtreeSize, inorder, inStart, rootIndex - 1);
//////        root.right = buildTreeHelper(preorder, preStart + leftSubtreeSize + 1, preEnd, inorder, rootIndex + 1, inEnd);
////
//////        return root;
////    }
//
//
//    private Map<Integer, Integer> indexMap;
//
//    public TreeNode myBuildTree(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
//        if (preorder_left > preorder_right) {
//            return null;
//        }
//
//        // 前序遍历中的第一个节点就是根节点
//        int preorder_root = preorder_left;
//        // 在中序遍历中定位根节点
//        int inorder_root = indexMap.get(preorder[preorder_root]);
//
//        // 先把根节点建立出来
//        TreeNode root = new TreeNode(preorder[preorder_root]);
//        // 得到左子树中的节点数目
//        int size_left_subtree = inorder_root - inorder_left;
//        // 递归地构造左子树，并连接到根节点
//        // 先序遍历中「从 左边界+1 开始的 size_left_subtree」个元素就对应了中序遍历中「从 左边界 开始到 根节点定位-1」的元素
//        root.left = myBuildTree(preorder, inorder, preorder_left + 1, preorder_left + size_left_subtree, inorder_left, inorder_root - 1);
//        // 递归地构造右子树，并连接到根节点
//        // 先序遍历中「从 左边界+1+左子树节点数目 开始到 右边界」的元素就对应了中序遍历中「从 根节点定位+1 到 右边界」的元素
//        root.right = myBuildTree(preorder, inorder, preorder_left + size_left_subtree + 1, preorder_right, inorder_root + 1, inorder_right);
//        return root;
//    }
//
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        int n = preorder.length;
//        // 构造哈希映射，帮助我们快速定位根节点
//        indexMap = new HashMap<Integer, Integer>();
//        for (int i = 0; i < n; i++) {
//            indexMap.put(inorder[i], i);
//        }
//        return myBuildTree(preorder, inorder, 0, n - 1, 0, n - 1);
//    }
//
//
//    // 判断二叉树是否对称
//    public boolean isSymmetric(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        return isMirror(root.left, root.right);
//    }
//
//    // 递归判断两个子树是否互为镜像
//    private boolean isMirror(TreeNode t1, TreeNode t2) {
//        if (t1 == null && t2 == null) {
//            return true;
//        }
//        if (t1 == null || t2 == null) {
//            return false;
//        }
//        return (t1.val == t2.val)
//                && isMirror(t1.right, t2.left)
//                && isMirror(t1.left, t2.right);
//    }
//
//    // 测试方法
//    public static void main(String[] args) {
//        BinaryTree bt = new BinaryTree();
//
//        // 非对称二叉树
//        int[] preorder1 = {1, 2, 4, 5, 3, 6, 7};
//        int[] inorder1 = {4, 2, 5, 1, 6, 3, 7};
//        TreeNode root1 = bt.buildTree(preorder1, inorder1);
//        // 应该输出 false
//        System.out.println("Is tree 1 symmetric? " + bt.isSymmetric(root1));
//
//        // 对称二叉树
//        int[] preorder2 = {1, 2, 2, 3, 4, 4, 3};
//        int[] inorder2 = {2, 4, 2, 3, 1, 3, 4};
//        TreeNode root2 = bt.buildTree(preorder2, inorder2);
//        // 应该输出 true
//        System.out.println("Is tree 2 symmetric? " + bt.isSymmetric(root2));
//    }
//}





















//public class BinaryTree {
//
//    // 辅助类，用于根据先序和中序遍历构造二叉树
//    private static class BuildHelper {
//        public TreeNode buildTree(int[] preorder,
//                                  int preStart,
//                                  int preEnd,
//                                  int[] inorder,
//                                  int inStart,
//                                  int inEnd) {
//            if (preStart > preEnd || inStart > inEnd) {
//                return null;
//            }
//
//            TreeNode root = new TreeNode(preorder[preStart]);
//            int rootIndex = -1;
//            for (int i = inStart; i <= inEnd; i++) {
//                if (inorder[i] == root.val) {
//                    rootIndex = i;
//                    break;
//                }
//            }
//
//            int leftSubtreeSize = rootIndex - inStart;
//            root.left = buildTree(preorder,
//                    preStart + 1,
//                    preStart + leftSubtreeSize,
//                    inorder, inStart,
//                    rootIndex - 1);
//
//            root.right = buildTree(preorder,
//                    preStart + leftSubtreeSize + 1,
//                    preEnd, inorder,
//                    rootIndex + 1, inEnd);
//
//            return root;
//        }
//    }
//
//    // 构造二叉树
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        return new BuildHelper().buildTree(preorder,
//                0,
//                preorder.length - 1,
//                inorder,
//                0,
//                inorder.length - 1);
//    }
//
//    // 判断二叉树是否对称
//    public boolean isSymmetric(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        return isMirror(root.left, root.right);
//    }
//
//    // 递归判断两个子树是否互为镜像
//    private boolean isMirror(TreeNode t1, TreeNode t2) {
//        if (t1 == null && t2 == null) {
//            return true;
//        }
//        if (t1 == null || t2 == null) {
//            return false;
//        }
//        return (t1.val == t2.val)
//                && isMirror(t1.right, t2.left)
//                && isMirror(t1.left, t2.right);
//    }
//
//    // 测试方法
//    public static void main(String[] args) {
//        BinaryTree bt = new BinaryTree();
//
//        // 非对称二叉树
//        int[] preorder1 = {1, 2, 4, 5, 3, 6, 7};
//        int[] inorder1 = {4, 2, 5, 1, 6, 3, 7};
//        TreeNode root1 = bt.buildTree(preorder1, inorder1);
//        // 应该输出 false
//        System.out.println("Is tree 1 symmetric? " + bt.isSymmetric(root1));
//
//        // 对称二叉树
//        int[] preorder2 = {1, 2, 2, 3, 4, 4, 3};
//        int[] inorder2 = {2, 4, 2, 3, 1, 3, 4};
//        TreeNode root2 = bt.buildTree(preorder2, inorder2);
//        // 应该输出 true
//        System.out.println("Is tree 2 symmetric? " + bt.isSymmetric(root2));
//    }
//}















