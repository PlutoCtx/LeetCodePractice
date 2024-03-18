package The1500.P1300.P1240.Q1232;

/**
 * LeetCodePractice
 * 缀点成线
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/14 18:45
 * @since JDK17
 */

public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int[] point1 = coordinates[0];
        int[] point2 = coordinates[1];

        if(point1[0] == point2[0]) {
            for (int[] coordinate : coordinates) {
                if (coordinate[0] != point1[0]) {
                    return false;
                }
            }
        } else if(point1[1] == point2[1]) {
            for (int[] coordinate : coordinates) {
                if (coordinate[1] != point1[1]) {
                    return false;
                }
            }
        } else {
            double k = 1.0 * (point1[1] - point2[1]) / (point1[0] - point2[0]);
            for(int i = 0; i < coordinates.length - 1; i++) {
                double k1 = (1.0 * coordinates[i][1] - 1.0 * coordinates[i + 1][1]) / (1.0 * coordinates[i][0] - 1.0 * coordinates[i + 1][0]);
                if(k != k1) {
                    return false;
                }
            }
        }

        return true;
    }
}
