package The1500.P1100.P1060.Q1056;

/**
 * LeetCodePractice
 * 易混淆数
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/15 9:34
 * @since JDK17
 */

public class Solution {

    public boolean confusingNumber(int n) {
        int original = n;
        int rotated = 0;
        while (original > 0) {
            int rotatedDigit = getRotatedDigit(original % 10);
            if (rotatedDigit < 0) {
                return false;
            }
            rotated = rotated * 10 + rotatedDigit;
            original /= 10;
        }
        return rotated != n;
    }

    public int getRotatedDigit(int digit) {
        if (digit == 0 || digit == 1 || digit == 8) {
            return digit;
        }
        if (digit == 6 || digit == 9) {
            return 15 - digit;
        }
        return -1;
    }



}
