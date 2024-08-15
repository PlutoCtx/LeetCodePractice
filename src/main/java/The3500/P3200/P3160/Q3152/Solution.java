package The3500.P3200.P3160.Q3152;


/**
 * LeetCodePractice
 * 特殊数组 II
 *
 * @author PlutoCtx    ctx195467@163.com
 * @version 2024/8/14 20:13
 * @since JDK17
 */

public class Solution {


    /**
     * 特殊数组：
     * 该数组中的某段连续的子数组的元素，相邻之间奇偶性是否都不同
     * @param nums  完整的数组
     * @param queries   二维数组，包含了nums中子数组的起始位置
     * @return  是不是特殊数组
     */
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {

        /*
         * 前缀和
         */
        int[] s = new int[nums.length];

        /*
            s用于保存前缀和
         */
        for (int i = 1; i < nums.length; i++) {
            // 如果前一个数和后一个数的奇偶性相同，则+1，否则+0
            // s[0] = 0
            // 如果所有的相邻元素奇偶性都不同，则s[i]始终为0
            // 否则从某一处开始将一直为0
            // 同时，若s[i] == 1, s[j] == 1, 那么s[i]到s[j]之间的元素奇偶性都不同
            // 直到s[j]变为2
            // 所以，只需要判断s[i] == s[j]即可知道相邻元素奇偶性是否都不同
            s[i] = s[i - 1] + (nums[i - 1] % 2 == nums[i] % 2 ? 1 : 0);
        }

        boolean[] res = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            // 如果s[queries[i][0]] == s[queries[i][1]]，
            // 那么queries[i][0]到queries[i][1]之间的相邻元素奇偶性都不同
            res[i] = s[queries[i][0]] == s[queries[i][1]];
        }

        return res;

        /*
            超时
         */
//        int len = queries.length;
//        boolean[] res = new boolean[len];
//        Arrays.fill(res, true);
//
//        for(int i = 0; i < len; i++) {
//            for (int j = queries[i][0]; j < queries[i][1]; j++) {
//                System.out.println((nums[j] + nums[j + 1]) % 2 == 0);
//                if((nums[j] + nums[j + 1]) % 2 == 0) {
//                    res[i] = false;
//                }
//            }
//        }
//        return res;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{3, 4, 1, 2, 6};
        int[][] queries = new int[][]{{0, 4}};

        Solution solution = new Solution();
        solution.isArraySpecial(nums, queries);



    }



}
