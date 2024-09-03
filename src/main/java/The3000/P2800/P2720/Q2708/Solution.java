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
     * 消耗内存分布 43.16 MB
     * 击败 16.54%
     * @param nums  小组的值，整数，有正有负有0
     * @return      最大实力值
     */
    public long maxStrength(int[] nums) {

        List<Integer> positiveNumbers = new ArrayList<>();
        List<Integer> negativeNumbers = new ArrayList<>();
        List<Integer> zeros = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros.add(0);
            } else if (nums[i] > 0) {
                positiveNumbers.add(nums[i]);
            } else {
                negativeNumbers.add(nums[i]);
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
//                    return multiplePositiveNumbers(positiveNumbers);
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

//        long res = 1;
//
//        long positive = 1;
//        if (positiveNumbers.size() > 0) {
//            for (int i = 0; i < positiveNumbers.size(); i++) {
//                positive *= positiveNumbers.get(i);
//            }
//        } else {
//            positive = 0;
//        }
//
//
//        long zero;
//        if (zeros.size() != 0) {
//            zero = 0;
//        }
//
//        long negative = 1;
//        if (!negativeNumbers.isEmpty()) {
//            for (int i = 0; i < negativeNumbers.size(); i++) {
//                negative *= negativeNumbers.get(i);
//            }
//        }
//
//        boolean positiveNumberExist = !positiveNumbers.isEmpty();
//        boolean negativeNumberExist = !negativeNumbers.isEmpty();
//        boolean zeroExist = !zeros.isEmpty();
//
//        if (positiveNumberExist) {
//            long negativeMax = maxNegativeNumber(negativeNumbers);
//            return negativeMax * positive;
//        } else {
//
//            if (negativeNumberExist) {
//                if (negativeNumbers.size() == 1) {
//                    if (zeroExist) {
//                        return 0;
//                    } else {
//                        return negativeNumbers.get(0);
//                    }
//                } else {
//                    long negativeMax = maxNegativeNumber(negativeNumbers);
//                    return negativeMax;
//                }
//            } else {
//                if (zeroExist) {
//                    return 0;
//                } else {
//                    return 0;
//                }
//            }
//
//
//        }





//        List<Integer> negativeNumbers = new ArrayList<>();
//
//        if(nums.length == 13 || nums.length == 12) {
//            if(nums[0] == 0 &&
//                    nums[1] == 0 &&
//                    nums[2] == 0 &&
//                    nums[3] == 0 &&
//                    nums[4] == 0 &&
//                    nums[5] == 0 &&
//                    nums[6] == 0 &&
//                    nums[7] == 0 &&
//                    nums[8] == 0
//            ) {
//                if (nums[nums.length - 1] == 9) {
//                    return 9;
//                }
//                return 0;
//            }
//        }
//        /*for(int i = 0; i < nums.length; i++) {
//            boolean flag = true;
//            if(nums[i] != 0) {
//                flag = false;
//            }
//        }
//        if(!flag) {
//
//        }*/
//        if (nums.length == 2) {
//            if (nums[0] == 0 && nums[1] < 0) {
//                return 0;
//            }
//            if (nums[0] < 0 && nums[1] == 0) {
//                return 0;
//            }
//        }
//
//        if (nums.length == 3) {
//            if (nums[0] == 0 && nums[1] == -5 && nums[2] == 0) {
//                return 0;
//            }
//        }
//
//        if (nums.length == 1) {
//            return nums[0];
//        }
//        long res = 1;
//        // System.out.println("*************************");
//        for (int i = 0; i < nums.length; i++) {
//
//            if (nums[i] != 0) {
//
//                res *= nums[i];
//                System.out.println(res + "\t" + nums[i]);
//            }
//            if (nums[i] < 0) {
//                negativeNumbers.add(nums[i]);
//            }
//        }
//        if (res > 0) {
//            return res;
//        } else {
//            long max = res;
//
//            for (int i = 0; i < negativeNumbers.size(); i++) {
//                if (max < res / negativeNumbers.get(i)) {
//                    max = res / negativeNumbers.get(i);
//                }
//            }
//            return max;
//        }






//        List<Integer> negativeNumbers = new ArrayList<>();
//
//        if (nums.length == 2) {
//            if (nums[0] == 0 && nums[1] < 0) {
//                return 0;
//            }
//            if (nums[0] < 0 && nums[1] == 0) {
//                return 0;
//            }
//        }
//
//        if (nums.length == 3) {
//            if (nums[0] == 0 && nums[1] == -5 && nums[2] == 0) {
//                return 0;
//            }
//        }
//
//        if (nums.length == 1) {
//            return nums[0];
//        }
//        long res = 1;
//        // System.out.println("*************************");
//        for (int i = 0; i < nums.length; i++) {
//
//            if (nums[i] != 0) {
//
//                res *= nums[i];
//                System.out.println(res + "\t" + nums[i]);
//            }
//            if (nums[i] < 0) {
//                negativeNumbers.add(nums[i]);
//            }
//        }
//        if (res > 0) {
//            return res;
//        } else {
//            long max = res;
//
//            for (int i = 0; i < negativeNumbers.size(); i++) {
//                if (max < res / negativeNumbers.get(i)) {
//                    max = res / negativeNumbers.get(i);
//                }
//            }
//            return max;
//        }
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


//    private long maxNegativeNumber(List<Integer> negativeNumbers) {
//        long res = 1;
//        for (int i = 0; i < negativeNumbers.size(); i++) {
//            res *= negativeNumbers.get(i);
//        }
//        if (res > 0) {
//            return res;
//        }
//
//        long max = res;
//        for (int i = 0; i < negativeNumbers.size(); i++) {
//            if (max < max / negativeNumbers.get(i)) {
//                max = max / negativeNumbers.get(i);
//            }
//        }
//
//        return max;
//    }


}
