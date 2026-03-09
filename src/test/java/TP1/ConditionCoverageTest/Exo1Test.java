package TP1.ConditionCoverageTest;

import org.junit.jupiter.api.Test;
import TP1.Palindrome;

import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {

    @Test
    void nullConditionShouldBeTrue() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }

    @Test
    void nullConditionShouldBeFalseAndLoopConditionShouldBeFalse() {
        assertTrue(Palindrome.isPalindrome("a"));
    }

    @Test
    void loopConditionShouldBeTrueAndComparisonConditionShouldBeTrue() {
        assertFalse(Palindrome.isPalindrome("ab"));
    }
}