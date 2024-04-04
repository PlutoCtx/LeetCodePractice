package The500.P300.P240.Q240;

/**
 * LeetCodePractice
 * 搜索二维矩阵 II
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/4 23:38
 * @since JDK17
 */

public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;
        while(i >= 0 && j < matrix[0].length)
        {
            if(matrix[i][j] > target) {
                i--;
            } else if(matrix[i][j] < target) {
                j++;
            } else {
                return true;
            }
        }
        return false;
    }

}
