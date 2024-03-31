package The1000.P900.P860.Q860;

/**
 * LeetCodePractice
 * 柠檬水找零
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/1 0:06
 * @since JDK17
 */

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int b : bills) {
            // 无需找零
            if (b == 5) {
                five++;
            } else if (b == 10) { // 返还 5
                five--;
                ten++;
            } else if (ten > 0) { // 此时 b=20，返还 10+5
                five--;
                ten--;
            } else { // 此时 b=20，返还 5+5+5
                five -= 3;
            }
            if (five < 0) { // 无法正确找零
                return false;
            }
        }
        return true;
    }
}


