package hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeCheckerTest {

    @Test
    public void testOddDigitsNum() {
        assertTrue(PalindromeChecker.check(0));
        assertTrue(PalindromeChecker.check(3));
        assertTrue(PalindromeChecker.check(121));
        assertTrue(PalindromeChecker.check(111));
        assertTrue(PalindromeChecker.check(12321));

        assertFalse(PalindromeChecker.check(12341));
        assertFalse(PalindromeChecker.check(-121));
    }

    @Test
    public void testEvenDigitsNum() {
        assertTrue(PalindromeChecker.check(11));
        assertTrue(PalindromeChecker.check(1111));
        assertTrue(PalindromeChecker.check(987789));

        assertFalse(PalindromeChecker.check(10));
        assertFalse(PalindromeChecker.check(123331));
        assertFalse(PalindromeChecker.check(-987789));
    }

    @Test
    public void testRecursiveOddDigitsNum() {
        assertTrue(PalindromeChecker.recursiveCheck(0));
        assertTrue(PalindromeChecker.recursiveCheck(3));
        assertTrue(PalindromeChecker.recursiveCheck(121));
        assertTrue(PalindromeChecker.recursiveCheck(111));
        assertTrue(PalindromeChecker.recursiveCheck(12321));

        assertFalse(PalindromeChecker.recursiveCheck(12341));
        assertFalse(PalindromeChecker.recursiveCheck(-121));
    }

    @Test
    public void testRecursiveEvenDigitsNum() {
        assertTrue(PalindromeChecker.recursiveCheck(11));
        assertTrue(PalindromeChecker.recursiveCheck(1111));
        assertTrue(PalindromeChecker.recursiveCheck(987789));

        assertFalse(PalindromeChecker.recursiveCheck(10));
        assertFalse(PalindromeChecker.recursiveCheck(123331));
        assertFalse(PalindromeChecker.recursiveCheck(-987789));
    }
}
