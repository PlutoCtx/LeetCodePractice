package P100.P60.Q50;

/**
 * LeetCodePractice
 * Pow(x, n)
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/15 10:14
 * @since JDK17
 */

public class Solution {

    public double myPow(double x, int n) {
        double res = 1.0;

        if(x == 1.0) {
            return 1.0;
        } else {
            if(n == 0) {
                return 1.0;
            } else if (n > 0) {
                for(int i = 0; i < n; i++) {
                    res *= x;
                }
            } else {
                if (n < -2147483646) {
                    n = 2147483646;
                } else {
                    n = -1 * n;
                }
                for(int i = 0; i < n; i++) {
                    res = res / x;
                }
            }
        }
        return res;
    }
}
