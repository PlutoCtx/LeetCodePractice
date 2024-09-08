package The1000.P1000.P1000.P980.Q977;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testSortedSquares() {

        Solution solution = new Solution();

        int[] nums = new int[]{-7, -3, 2, 3, 11};

        for (int n : solution.sortedSquares(nums)) {
            System.out.print(n + "\t");
        }












    }
}
