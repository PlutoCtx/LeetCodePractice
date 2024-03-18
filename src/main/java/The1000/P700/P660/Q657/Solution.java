package The1000.P700.P660.Q657;

/**
 * LeetCodePractice
 * 机器人能否回到原点
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/13 23:59
 * @since JDK17
 */

public class Solution {

    public boolean judgeCircle(String moves) {
        int vertical = 0;
        int horizontal = 0;

        char[] charMoves = moves.toCharArray();
        for (char charMove : charMoves) {
            if (charMove == 'L') {
                horizontal++;
            }
            if (charMove == 'R') {
                horizontal--;
            }
            if (charMove == 'U') {
                vertical++;
            }
            if (charMove == 'D') {
                vertical--;
            }
        }
        return vertical == 0 && horizontal == 0;
    }

}
