package P900.P880.Q896;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * SolutionTest
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/15 0:14
 * @since JDK17
 */

public class SolutionTest {

    @Test
    public void testIsMonotonic() {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 2, 3};
        System.out.println(solution.isMonotonic(nums1));

        int[] nums2 = {6, 5, 4, 4};
        System.out.println(solution.isMonotonic(nums2));


        int[] nums3 = {1, 3, 2};
        System.out.println(solution.isMonotonic(nums3));
    }
}
