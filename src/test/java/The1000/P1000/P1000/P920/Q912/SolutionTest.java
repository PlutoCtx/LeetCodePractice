package The1000.P1000.P1000.P920.Q912;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testSortArray() {
        Solution solution = new Solution();

        int[] nums = new int[]{5, 2, 3, 1};
        assertEquals(new int[]{1, 2, 3, 5}, solution.sortArray(nums));

        nums = new int[]{5, 1, 1, 2, 0, 0};
        assertEquals(new int[]{0, 0, 1, 1, 2, 5}, solution.sortArray(nums));

    }
}
