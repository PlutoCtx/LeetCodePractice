package The3500.P3200.P3180.Q3174;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testClearDigits() {

        Solution solution = new Solution();

        String string = "abc";
        assertEquals("abc", solution.clearDigits(string));

        string = "cb34";
        assertEquals("", solution.clearDigits(string));

    }
}
