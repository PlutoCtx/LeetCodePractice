package P1600.P1520.Q1502;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testCanMakeArithmeticProgression() {
        Solution solution = new Solution();
        int[] arr = new int[]{3, 5, 1};
        assertTrue(solution.canMakeArithmeticProgression(arr));

        arr = new int[]{1, 2, 4};
        assertFalse(solution.canMakeArithmeticProgression(arr));

    }
}
