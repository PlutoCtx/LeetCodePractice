package The1500.P1500.P1460.Q1450;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testBusyStudent() {
        Solution solution = new Solution();

        int[] startTime = {1, 2, 3};
        int[] endTime = {3, 2, 7};
        int queryTime = 4;
        assertEquals(1, solution.busyStudent(startTime, endTime, queryTime));

        startTime = new int[]{4};
        endTime = new int[]{4};
        queryTime = 4;
        assertEquals(1, solution.busyStudent(startTime, endTime, queryTime));

    }
}
