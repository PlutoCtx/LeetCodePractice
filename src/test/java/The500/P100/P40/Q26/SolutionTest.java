package The500.P100.P40.Q26;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testRemoveDuplicates() {

        int[] nums = {1, 1, 2};
        int[] expected = {1, 2};
        Solution solution = new Solution();
        int k = solution.removeDuplicates(nums);
        assertEquals(k, 2);



    }
}
