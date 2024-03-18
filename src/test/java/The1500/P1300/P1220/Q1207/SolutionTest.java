package The1500.P1300.P1220.Q1207;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testUniqueOccurrences() {
        int[] nums = new int[]{1,2,2,1,1,3};
        boolean flag = new Solution().uniqueOccurrences(nums);
        assertTrue(flag);

        nums = new int[] {1, 2};
        flag = new Solution().uniqueOccurrences(nums);
        assertFalse(flag);

        nums = new int[]{-3,0,1,-3,1,1,1,-3,10,0};
        flag = new Solution().uniqueOccurrences(nums);
        assertTrue(flag);


    }

}
