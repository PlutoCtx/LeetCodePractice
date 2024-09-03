package The3000.P2800.P2720.Q2708;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testMaxStrength() {

        Solution solution = new Solution();
        int[] nums = {3, -1, -5, 2, 5, -9};
        assertEquals(1350, solution.maxStrength(nums));

        nums = new int[]{-4, -5, -4};
        assertEquals(20, solution.maxStrength(nums));

        nums = new int[]{0, -1};
        assertEquals(0, solution.maxStrength(nums));

        nums = new int[]{-3, -1, -4, -6, -4, 8, -1, 3, 9, -3};
        assertEquals(186624, solution.maxStrength(nums));
    }
}
