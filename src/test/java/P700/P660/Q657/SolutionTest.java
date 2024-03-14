package P700.P660.Q657;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testJudgeCircle() {
        Solution solution = new Solution();
        String moves = "UD";
        assertTrue(solution.judgeCircle(moves));

        moves = "LL";
        assertFalse(solution.judgeCircle(moves));
    }
}
