package P1300.P1240.Q1232;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testCheckStraightLine() {
        Solution solution = new Solution();
        int[][] coordinates = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        assertTrue(solution.checkStraightLine(coordinates));

        coordinates = new int[][]{{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
        assertFalse(solution.checkStraightLine(coordinates));
    }
}
