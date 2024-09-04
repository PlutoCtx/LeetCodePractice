package The3500.P3300.P3280.Q3274;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testCheckTwoChessboards() {

        Solution solution = new Solution();
        String coordinate1 = "a1";
        String coordinate2 = "c3";

        assertTrue(solution.checkTwoChessboards(coordinate1, coordinate2));

        coordinate1 = "a1";
        coordinate2 = "h3";
        assertFalse(solution.checkTwoChessboards(coordinate1, coordinate2));

        coordinate1 = "h7";
        coordinate2 = "c8";
        assertTrue(solution.checkTwoChessboards(coordinate1, coordinate2));



        //        solution.checkTwoChessboards(coordinate1, coordinate2);



    }
}
