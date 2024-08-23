package The1500.P1200.P1180.Q1167;

import java.util.Arrays;

/**
 * LeetCodePractice
 * 连接木棍的最低费用
 *
 * @author PlutoCtx    ctx195467@163.com
 * @version 2024/8/15 22:59
 * @since JDK17
 */

public class Solution {

    public int connectSticks(int[] sticks) {

        if (sticks.length == 1) {
            return 0;
        } else if (sticks.length == 2) {
            return sticks[0] + sticks[1];
        } else {

//            for (int i = 0; i < sticks.length - 1; i++) {
//                for (int j = i + 1; j < sticks.length; j++) {
//                    if (sticks[i] < sticks[j]) {
//                        int temp = sticks[i];
//                        sticks[i] = sticks[j];
//                        sticks[j] = temp;
//                    }
//                }
//            }
            Arrays.sort(sticks);
            System.out.println(Arrays.toString(sticks));

            int res = 0;
            int cnt = 1;
            for (int i = sticks.length - 1; i >= 0; i--) {
                res += sticks[i] * cnt;
                cnt++;
            }
            return res - sticks[0];


        }
    }


    public static void main(String[] args) {

//        int[] sticks = {1, 8, 3, 5};
//        int[] sticks = {2, 4, 3};
        int[] sticks = {3354,4316,3259,4904,4598,474,3166,6322,8080,9009};
        /*
        474,
        3166,


        3259,
        3354,
        3640
        4316,
        4598,
        4904,
        6322,
        8080,
        9009



         */
        Solution solution = new Solution();
        System.out.println(solution.connectSticks(sticks));

    }
}
