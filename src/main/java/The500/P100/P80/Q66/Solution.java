package The500.P100.P80.Q66;

/**
 * LeetCodePractice
 * 加一
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/21 9:56
 * @since JDK17
 */

public class Solution {


    public int[] plusOne(int[] digits) {
        int len = digits.length;
        Long sum = 0L;
        int k = 1;

        for (int i = len - 1; i >= 0; i--) {
            sum += (long) digits[i] * k;
            k *= 10;
        }
        System.out.println(sum);
        sum += 1;
        Long s = sum;

        return initArray(s);
    }


    public static int[] initArray(Long num) {
        String str = num.toString();
        int[] array = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            array[i] = Integer.parseInt(Character.toString(ch));
        }
        return array;
    }
}
