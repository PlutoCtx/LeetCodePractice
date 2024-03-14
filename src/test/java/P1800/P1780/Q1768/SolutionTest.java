package P1800.P1780.Q1768;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("set up");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("tear down");
    }

    @Test
    public void testMergeAlternately() {
        Solution solution = new Solution();
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(solution.mergeAlternately(word1, word2));


        word1 = "ab";
        word2 = "pqrs";
        System.out.println(solution.mergeAlternately(word1, word2));


        word1 = "abcd";
        word2 = "pq";
        System.out.println(solution.mergeAlternately(word1, word2));
    }
}
