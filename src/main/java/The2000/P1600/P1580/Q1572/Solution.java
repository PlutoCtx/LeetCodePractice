package The2000.P1600.P1580.Q1572;

/**
 * LeetCodePractice
 * 矩阵对角线元素的和
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/14 0:02
 * @since JDK17
 */

public class Solution {

    public int diagonalSum(int[][] mat) {
        int m = mat.length;
        int res = 0;
        for(int i = 0; i < m; i++) {
            res += (mat[i][i] + mat[i][m - i - 1]);
        }
        if(m % 2 == 1) {
            res = res - mat[m / 2][m / 2];
        }
        return res;
    }
}
