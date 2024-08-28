package The3500.P3200.P3160.Q3142;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testSatisfiesConditions() {
        Solution solution = new Solution();

        int[][] grid = {{1, 0, 2}, {1, 0, 2}};
        assertTrue(solution.satisfiesConditions(grid));

        grid = new int[][]{{1, 1, 1}, {0, 0, 0}};
        assertFalse(solution.satisfiesConditions(grid));

        grid = new int[][]{{1}, {2}, {3}};
        assertFalse(solution.satisfiesConditions(grid));


    }
}
