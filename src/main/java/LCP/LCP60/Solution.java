package LCP.LCP60;

import java.util.*;

/**
 * LeetCodePractice
 * 力扣泡泡龙
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/6 16:27
 * @since JDK17
 */

public class Solution {


    /**
     * 暴力解法。分层存储节点，然后分别刺破可以刺破的泡泡后重新计算最大层和。会超时。
     *
     * @param root
     * @return
     */
    public int getMaxLayerSum(TreeNode root) {
        // 分层存储节点，后面要利用下标来查找子节点，所以空节点也要存入占位。
        List<TreeNode[]> layers = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int max = Integer.MIN_VALUE;
        // 可以刺破的泡泡位置,int[0]表示层数，int[1]表示该层中的序号,int[2]表示下层对应节点的偏移量
        List<int[]> positions = new ArrayList<>();
        boolean hasNode = true;
        while (hasNode) {
            hasNode = false;
            TreeNode[] nodes = new TreeNode[queue.size()];
            int sum = 0;
            for (int i = 0, size = queue.size(); i < size; i++) {
                TreeNode node = queue.remove();
                if (node == null) {
                    queue.add(null);
                    queue.add(null);
                    continue;
                }
                if (node.left == null || node.right == null) {
                    positions.add(new int[]{layers.size(), i, node.left != null ? i : i + 1});
                }
                sum += node.val;
                nodes[i] = node;
                queue.add(node.left);
                queue.add(node.right);
                if (node.left != null || node.right != null) {
                    hasNode = true;
                }
            }
            max = Math.max(max, sum);
            layers.add(nodes);
        }
        for (int[] position : positions) {
            max = Math.max(max, getMax(layers, position[0], position[1], position[2]));
        }
        return max;
    }

    /**
     * 计算刺破某个节点后的最大层和
     *
     * @param layers 分层存储的节点
     * @param layer  要刺破的节点所在层号
     * @param j      要刺破的节点在某层序号
     * @param shift  上移的子节点相对于父节点的偏移量
     * @return
     */
    private int getMax(List<TreeNode[]> layers, int layer, int j, int shift) {
        int max = Integer.MIN_VALUE;
        // [left,right]区间是需要被下一层的元素替换的区间
        int left = j, right = j;
        for (; layer < layers.size(); layer++) {
            int sum = 0;
            boolean hasNode = false;
            for (int k = 0; k < layers.get(layer).length; k++) {
                TreeNode node = null;
                if (k >= left && k <= right) {
                    if (layer + 1 < layers.size()) {
                        node = layers.get(layer + 1)[k + shift];
                    }
                } else {
                    node = layers.get(layer)[k];
                }
                if (node != null) {
                    sum += node.val;
                    hasNode = true;
                }
            }
            // 排除掏空了某一层的情形
            if (hasNode) {
                max = Math.max(max, sum);
            }
            // 区间扩展
            left <<= 1;
            right = (right << 1) + 1;
            // 偏移量翻倍
            shift <<= 1;
        }
        return max;
    }

    /**
     * 计算出每层的和、每层和的最大增量，然后求得结果
     *
     * @param root
     * @return
     */
    public int getMaxLayerSum2(TreeNode root) {
        List<Integer> layerSums = new ArrayList<>();
        List<Integer> layerCounts = new ArrayList<>();
        statsByLayer(root, 0, layerSums, layerCounts);
        Map<Integer, Integer> layerMaxIncrements = new HashMap<>();
        dfs(root, 0, layerCounts, layerMaxIncrements);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < layerSums.size(); i++) {
            max = Math.max(max, layerSums.get(i) + layerMaxIncrements.getOrDefault(i, 0));
        }
        return max;
    }

    /**
     * 分层统计每层的和、每层的节点数
     *
     * @param root
     * @param depth
     * @param layerSums
     * @param layerCounts
     */
    private void statsByLayer(TreeNode root, int depth, List<Integer> layerSums, List<Integer> layerCounts) {
        if (root == null) {
            return;
        }
        if (depth == layerSums.size()) {
            layerSums.add(root.val);
            layerCounts.add(1);
        } else {
            layerSums.set(depth, layerSums.get(depth) + root.val);
            layerCounts.set(depth, layerCounts.get(depth) + 1);
        }
        statsByLayer(root.left, depth + 1, layerSums, layerCounts);
        statsByLayer(root.right, depth + 1, layerSums, layerCounts);
    }

    /**
     * 计算将root节点的全部子孙节点上移一层后每层节点和、节点数量的增量。返回的map中key为深度（从0开始计），value为数组记为arr，
     * arr[0]表示节点和的增量，arr[1]表示节点数量增量。（这里不用考虑root节点是否有空的子节点，因为我们仅仅会在符合题意时去计算
     * 每层节点和的最大增量）
     *
     * @param root
     * @param depth
     * @param layerCounts
     * @param layerMaxIncrements
     * @return
     */
    private Map<Integer, int[]> dfs(TreeNode root, int depth, List<Integer> layerCounts, Map<Integer, Integer> layerMaxIncrements) {
        if (root == null) {
            return new HashMap<>();
        }
        Map<Integer, int[]> leftIncrements = dfs(root.left, depth + 1, layerCounts, layerMaxIncrements);
        Map<Integer, int[]> rightIncrements = dfs(root.right, depth + 1, layerCounts, layerMaxIncrements);
        // 父节点的增量等于孩子节点增量的简单相加
        Map<Integer, int[]> merged = merge(leftIncrements, rightIncrements);
        int increment = -root.val;
        int countIncrement = -1;
        if (root.left != null) {
            increment += root.left.val;
            countIncrement++;
        }
        if (root.right != null) {
            increment += root.right.val;
            countIncrement++;
        }
        // 加入当前行的增量
        merged.put(depth, new int[]{increment, countIncrement});
        // 至少有一个孩子为空才可以刺破泡泡
        if (root.left == null || root.right == null) {
            for (int i = depth, maxDepth = depth + merged.size() - 1; i <= maxDepth; i++) {
                int[] increments = merged.get(i);
                // 掏空了某层的情况直接跳过
                if (layerCounts.get(i) + increments[1] == 0) {
                    continue;
                }
                layerMaxIncrements.put(i, Math.max(layerMaxIncrements.getOrDefault(i, 0), increments[0]));
            }
        }
        return merged;
    }

    /**
     * 合并map，大map一定包含全部小map的键，所以直接向大map累加。
     *
     * @param a
     * @param b
     * @return
     */
    private Map<Integer, int[]> merge(Map<Integer, int[]> a, Map<Integer, int[]> b) {
        if (a.size() < b.size()) {
            return merge(b, a);
        }
        for (int depth : a.keySet()) {
            if (!b.containsKey(depth)) {
                continue;
            }
            int[] res1 = a.get(depth);
            int[] res2 = b.get(depth);
            res1[0] += res2[0];
            res1[1] += res2[1];
        }
        return a;
    }



}
