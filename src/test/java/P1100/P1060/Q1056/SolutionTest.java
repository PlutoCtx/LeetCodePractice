package P1100.P1060.Q1056;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testConfusingNumber() {

        for (int i = 0; i < 300; i++) {
            new Solution().confusingNumber(i);
        }
    }
}
