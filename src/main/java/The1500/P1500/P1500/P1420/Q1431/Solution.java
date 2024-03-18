package The1500.P1500.P1500.P1420.Q1431;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCodePractice
 * 拥有最多糖果的孩子
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/18 14:11
 * @since JDK17
 */

public class Solution {
    /**
     * 执行用时分布 0 ms
     * 击败 100.00% 使用 Java 的用户
     * 消耗内存分布 41.47 MB
     * 击败 21.22% 使用 Java 的用户
     * @param candies   每个孩子拥有的蛋糕数量
     * @param extraCandies  额外的蛋糕数量
     * @return  是否能够拥有最多数量的蛋糕
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            if (max < candy) {
                max = candy;
            }
        }

        List<Boolean> res = new ArrayList<>();
        for (int candy: candies) {
            if (candy + extraCandies >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }


    /**
     * 执行用时分布 0 ms
     * 击败 100.00% 使用 Java 的用户
     * 消耗内存分布 41.26 MB
     * 击败 75.10% 使用 Java 的用户
     * @param candies   每个孩子拥有的蛋糕数量
     * @param extraCandies  额外的蛋糕数量
     * @return  是否能够拥有最多数量的蛋糕
     */
    public List<Boolean> kidsWithCandiesOfficialSolution(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int j : candies) {
            maxCandies = Math.max(maxCandies, j);
        }
        List<Boolean> ret = new ArrayList<>();
        for (int candy : candies) {
            ret.add(candy + extraCandies >= maxCandies);
        }
        return ret;
    }
}
