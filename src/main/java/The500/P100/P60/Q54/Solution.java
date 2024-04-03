package The500.P100.P60.Q54;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCodePractice
 * 螺旋矩阵
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/1 0:04
 * @since JDK17
 */

class Solution {


        public List<Integer> spiralOrder02(int[][] matrix) {
            if (matrix.length == 0) {
                return new ArrayList<Integer>();
            }
            int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, x = 0;
            Integer[] res = new Integer[(r + 1) * (b + 1)];
            while (true) {
                for (int i = l; i <= r; i++) {
                    // left to right
                    res[x++] = matrix[t][i];
                }
                if (++t > b) {
                    break;
                }
                for (int i = t; i <= b; i++) {
                    // top to bottom
                    res[x++] = matrix[i][r];
                }
                if (l > --r) {
                    break;
                }
                for (int i = r; i >= l; i--) {
                    // right to left
                    res[x++] = matrix[b][i];
                }
                if (t > --b) {
                    break;
                }
                for (int i = b; i >= t; i--) {
                    // bottom to top
                    res[x++] = matrix[i][l];
                }
                if (++l > r) {
                    break;
                }
            }
            return Arrays.asList(res);
        }




    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> order = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return order;
        }
        int rows = matrix.length, columns = matrix[0].length;
        boolean[][] visited = new boolean[rows][columns];
        int total = rows * columns;
        int row = 0, column = 0;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directionIndex = 0;
        for (int i = 0; i < total; i++) {
            order.add(matrix[row][column]);
            visited[row][column] = true;
            int nextRow = row + directions[directionIndex][0], nextColumn = column + directions[directionIndex][1];
            if (nextRow < 0 || nextRow >= rows || nextColumn < 0 || nextColumn >= columns || visited[nextRow][nextColumn]) {
                directionIndex = (directionIndex + 1) % 4;
            }
            row += directions[directionIndex][0];
            column += directions[directionIndex][1];
        }
        return order;
    }
}


