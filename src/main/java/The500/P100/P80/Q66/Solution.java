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
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }






//    public int[] plusOne(int[] digits) {
////        int len = digits.length;
////        String Foo = null;
////        Long sum = Foo.valueOf(0L);
////        int k = 1;
////
////        for (int i = len - 1; i >= 0; i--) {
////            sum += (long) digits[i] * k;
////            k *= 10;
////        }
////        sum += 1;
////        Long s = sum;
////
////        return initArray(s);
//        return null;
//    }
//
//
//    public static int[] initArray(Long num) {
//        String str = num.toString();
//        int[] array = new int[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            array[i] = Integer.parseInt(Character.toString(ch));
//        }
//        return array;
//    }
}
