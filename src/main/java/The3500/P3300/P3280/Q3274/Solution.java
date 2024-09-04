package The3500.P3300.P3280.Q3274;

/**
 * LeetCodePractice
 * 检查棋盘方格颜色是否相同
 *
 * @author PlutoCtx    ctx195467@163.com
 * @version 2024/9/4 21:20
 * @since JDK17
 */

public class Solution {

    /**
     *
     * 执行用时分布
     * 0 ms
     * 击败 100.00%
     * 消耗内存分布
     * 41.11 MB
     * 击败 49.26%
     * @param coordinate1   坐标点1
     * @param coordinate2   坐标点2
     * @return              棋盘中的两格是否颜色相同
     */
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        char[] coordinate01 = coordinate1.toCharArray();
        char[] coordinate02 = coordinate2.toCharArray();

        return (Math.abs(coordinate01[0] - coordinate02[0]) +
                Math.abs(coordinate01[1] - coordinate02[1])) % 2 == 0;
    }
}
