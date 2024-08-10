package The500.P400.P320.Q319;

import java.util.Arrays;

/**
 * LeetCodePractice
 * 灯泡开关
 *
 * @author PlutoCtx
 * @version 2024/8/10 23:22
 * @email ctx195467@163.com
 * @since JDK17
 */

public class Solution {


    /**
     * 灯泡开关
     * n个灯泡，第一轮按下所有开关，
     * 第二轮按下所有编号为2的倍数的开关，
     * 以此类推，第n轮按下所有编号为n的倍数的开关，求最后有多少个灯泡亮着
     *
     * 解题思路：每一个灯泡都会被按，并且按的次数等于它的因子的个数，
     * 所以，只有因子个数为奇数的灯泡才会亮着
     * 而对于于一个数，它的因子个数是奇数当且仅当它是完全平方数
     * 所以，我们只要判断0-n中有多少个完全平方数即可
     * 一种方法是一个个验证，另一种方法这是直接返回根号n，向下取整，考虑到精度问题，
     * 在n+0.5的基础上取整
     * @param n 灯泡数量
     * @return  两者的灯泡数
     */
    public int bulbSwitch(int n) {


        return (int) Math.sqrt(n + 0.5);
        /*
            超时
         */
//        if (n == 0) {
//            return 0;
//        } else {
//            int res = 0;
//
//            for (int i = 1; i <= n; i++) {
//                if (Math.sqrt(i) % 1 == 0) {
//                    res++;
//                }
//            }
//            return res;
//        }

    }
}
