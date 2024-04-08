package The500.P100.P20.Q4;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testFindMedianSortedArrays() {
        int[] num1 = {1, 2, 5, 6, 7, 8, 9};
        int[] num2 = {3, 4, 12, 23, 34};

        Solution solution = new Solution();
        solution.findMedianSortedArrays(num1, num2);

    }
}
