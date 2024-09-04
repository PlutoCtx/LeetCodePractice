package The3000.P2900.P2860.Q2860;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testCountWays() {
        List<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(0);
        nums.add(3);
        nums.add(3);
        nums.add(6);
        nums.add(7);
        nums.add(2);
        nums.add(7);

        Solution solution = new Solution();
        assertEquals(3, solution.countWays(nums));


        nums.clear();
        nums.add(1);
        nums.add(1);
        assertEquals(2, solution.countWays(nums));

        nums.clear();
        nums.add(1);
        nums.add(1);
        nums.add(0);
        nums.add(1);
        assertEquals(1, solution.countWays(nums));

    }
}
