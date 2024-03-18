package The1000.P900.P900.Q896;

import org.testng.annotations.Test;

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
