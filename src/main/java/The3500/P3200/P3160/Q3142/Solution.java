package The3500.P3200.P3160.Q3142;

/**
 * LeetCodePractice
 * 判断矩阵是否满足条件
 *
 * @author PlutoCtx    ctx195467@163.com
 * @version 2024/8/29 0:39
 * @since JDK17
 */

public class Solution {


    /**
     * 已知矩阵grid，该矩阵是否满足：
     * 同一行中，左右两个相邻的各自元素是否不同
     * 同一列中，上下两个相邻的元素是否相同
     * 如果是，返回true
     * <p>
     *      执行用时分布 1 ms
     *      击败 14.16%
     * 消耗内存分布 43.25 MB
     * 击败 68.27%
     * </p>
     * @param grid      待确定的矩阵
     * @return  是否符合条件
     */
    public boolean satisfiesConditions(int[][] grid) {

//        if (satisfiesHorizontalConditions(grid)) {
//            return satisfiesVerticalCondidtions(grid);
//        } else {
//            return false;
//        }
        return satisfiesVerticalConditions(grid) && satisfiesHorizontalConditions(grid);
    }

    /**
     * 每一行的同行元素相邻之间是否都不相等
     * @param grid  矩阵
     * @return      是否符合条件
     */
    private boolean satisfiesHorizontalConditions(int[][] grid) {
        boolean flag = true;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length - 1; j++) {
                if (grid[i][j] == grid[i][j + 1]) {
                    return false;
                }
            }
        }
        return flag;
    }

    /**
     * 每一列的同列元素是否都相同
     * @param grid  矩阵
     * @return  是否符合条件
     */
    private boolean satisfiesVerticalConditions(int[][] grid) {
        boolean flag = true;
        for (int i = 0; i < grid.length - 1; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != grid[i + 1][j]) {
                    return false;
                }
            }
        }
        return flag;
    }


}
