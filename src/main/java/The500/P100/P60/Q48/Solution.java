package The500.P100.P60.Q48;

/**
 * LeetCodePractice
 * 旋转图像
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/4 23:37
 * @since JDK17
 */

public class Solution {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < (n + 1) / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = tmp;
            }
        }
    }

}
