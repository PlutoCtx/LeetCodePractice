package The3000.P2800.P2720.Q2708;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCodePractice
 * 一个小组的最大实力值
 *
 * @author PlutoCtx    ctx195467@163.com
 * @version 2024/9/3 12:11
 * @since JDK17
 */

public class Solution {

    /**
     * 一个小组的最大实力值
     * 执行用时分布 2 ms
     * 击败 54.14%
     * 消耗内存分布 43.04 MB
     * 击败 26.31%
     * @param nums  小组的值，整数，有正有负有0
     * @return      最大实力值
     */
    public long maxStrength(int[] nums) {

        List<Integer> positiveNumbers = new ArrayList<>();
        List<Integer> negativeNumbers = new ArrayList<>();
        List<Integer> zeros = new ArrayList<>();

        for (int num : nums) {
            if (num == 0) {
                zeros.add(0);
            } else if (num > 0) {
                positiveNumbers.add(num);
            } else {
                negativeNumbers.add(num);
            }
        }

        boolean isPositiveNumberExist = !positiveNumbers.isEmpty();
        boolean isNegativeNumberExist = !negativeNumbers.isEmpty();
        boolean isZeroExist = !zeros.isEmpty();

        long maxPositive = multiplePositiveNumbers(positiveNumbers);
        long maxNegative = multipleNegativeNumbers(negativeNumbers);
        if (isPositiveNumberExist) {
            if (isNegativeNumberExist) {
                if (negativeNumbers.size() == 1) {
                    return maxPositive;
                } else {
                    return maxPositive * maxNegative;
                }
            } else {
                return maxPositive;
            }
        } else {
            if (isNegativeNumberExist) {
                if (maxNegative < 0) {
                    if (isZeroExist) {
                        return 0;
                    } else {
                        return maxNegative;
                    }
                } else {
                    return maxNegative;
                }
            } else {
                return 0;
            }
        }
    }

    /**
     * 负数数组相乘的最大结果
     * @param negativeNumbers   负数数组
     * @return                  负数数组相乘的最大结果
     */
    private long multipleNegativeNumbers(List<Integer> negativeNumbers) {
        if (negativeNumbers.size() % 2 == 0) {
            long res = 1;
            for (int i = 0; i < negativeNumbers.size(); i++) {
                res *= negativeNumbers.get(i);
            }
            return res;
        } else {
            if (negativeNumbers.size() == 1) {
                return negativeNumbers.get(0);
            } else {
                long res = 1;
                for (int i = 0; i < negativeNumbers.size(); i++) {
                    res *= negativeNumbers.get(i);
                }

                long max = res;
                for (int i = 0; i < negativeNumbers.size(); i++) {
                    if (max < res / negativeNumbers.get(i)) {
                        max = res / negativeNumbers.get(i);
                    }
                }
                return max;
            }
        }


    }

    /**
     * 正数数组相乘得到结果
     * @param positiveNumbers   正数数组
     * @return                  正数相乘结果
     */
    private long multiplePositiveNumbers(List<Integer> positiveNumbers) {
        long res = 1;
        for (int i = 0; i < positiveNumbers.size(); i++) {
            res *= positiveNumbers.get(i);
        }
        return res;
    }


}
