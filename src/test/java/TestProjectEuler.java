
import org.junit.Test;
import java.util.ArrayList;
import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by sghuman on 30/06/2016.
 */

public class TestProjectEuler {

    Problem4 p1 = new Problem4();

    @Test
    public void testProbem1ReturnsAnswer() {
        assertEquals(233168, new Problem1().start());
    }

    @Test
    public void testProblem2ReturnsFibonacciNumbersBetween1and10() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(5);
        result.add(8);
        assertEquals(result,Problem2.start());

    }

    /**
     * Problem 4 test to see if a palindrome returns true.
     */
    @Test
    public void testNumberReturnsTrueIfPalindrome() {
        int a=909;
        assertTrue(Problem4.isNumberPalindrome(a));
    }

    /**
     * Problem 4 tests to see if not a palindrome returns false
     */
    @Test
    public void testNumberReturnsFalseIfPalindrome() {
        int a=912;
        assertFalse(Problem4.isNumberPalindrome(a));
    }

    /**
     * Problem 5. Tests to see if number not divisible
     * by all numbers in 1 to 20 returns false.
     */
    @Test
    public void testIfNumberNotDivisibleByAllReturnsFalse() {
        assertFalse(Problem5.isNumberDivisibleby1to20(500));

    }

    @Test
    public void testNumberDivisibleByAllReturnsTrue() {
        assertTrue(Problem5.isNumberDivisibleby1to20(232792560));

    }
}
