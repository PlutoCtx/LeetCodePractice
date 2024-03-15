package P1100.P1060.Q1056;

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
        int len = 1;
        int temp = n;
        while (temp != 0) {
            if (temp / 10 != 0) {
                len++;
            }
            temp = temp / 10;
        }
//        System.out.println(temp + "\t" + len);
        int[] special = new int[]{0, 1, 6, 8, 9};
        int[] exceptions = new int[]{2, 3, 4, 5, 7};
        int[] common = new int[]{0, 1, 8};

        if (len == 1) {
            if (n == 0 || n == 1 || n == 8) {
                return false;
            } else {
                return true;
            }
        } else {

        }















        return true;
    }
}
