package The1500.P1100.P1060.Q1041;

/**
 * LeetCodePractice
 * 困于环中的机器人
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/31 23:59
 * @since JDK17
 */

class Solution {
    public boolean isRobotBounded(String instructions) {
        int k = 0;
        int[] dist = new int[4];
        for (int i = 0; i < instructions.length(); ++i) {
            char c = instructions.charAt(i);
            if (c == 'L') {
                k = (k + 1) % 4;
            } else if (c == 'R') {
                k = (k + 3) % 4;
            } else {
                ++dist[k];
            }
        }
        return (dist[0] == dist[2] && dist[1] == dist[3]) || (k != 0);
    }
}

