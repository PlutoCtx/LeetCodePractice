package P100.P80.Q73;

import java.util.Arrays;

/**
 * LeetCodePractice
 * 矩阵置零
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/14 0:04
 * @since JDK17
 */

public class Solution {

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] flag = new boolean[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    flag[i][j] = true;
                }
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(flag[i][j]) {
                    Arrays.fill(matrix[i], 0);
                    for(int b = 0; b < m; b++) {
                        matrix[b][j] = 0;
                    }

                }
            }
        }



    }
}
