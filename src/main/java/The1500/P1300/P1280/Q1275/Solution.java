package The1500.P1300.P1280.Q1275;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCodePractice
 * 找出井字棋的获胜者
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/31 23:57
 * @since JDK17
 */

class Solution {
    public String tictactoe(int[][] moves) {
        // 每个格子用 x * 3 + y 表示
        int[][] wins = {
                // 三行
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8},
                // 三列
                {0, 3, 6},
                {1, 4, 7},
                {2, 5, 8},
                // 主对角线
                {0, 4, 8},
                // 副对角线
                {2, 4, 6}
        };
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        for (int i = 0; i < moves.length; ++i) {
            int pos = moves[i][0] * 3 + moves[i][1];
            if (i % 2 == 0) {
                setA.add(pos);
                if (check(setA, wins)) {
                    return "A";
                }
            } else {
                setB.add(pos);
                if (check(setB, wins)) {
                    return "B";
                }
            }
        }
        return moves.length == 9 ? "Draw" : "Pending";
    }

    public boolean check(Set<Integer> set, int[][] wins) {
        for (int[] win : wins) {
            boolean flag = true;
            for (int pos : win) {
                if (!set.contains(pos)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }
}


