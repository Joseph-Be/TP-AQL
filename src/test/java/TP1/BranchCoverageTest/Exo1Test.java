package TP1.BranchCoverageTest;

import org.junit.jupiter.api.Test;
import TP1.Palindrome;

import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {

    @Test
    void shouldThrowWhenNull() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }

    @Test
    void shouldReturnTrueWhenLoopIsSkipped() {
        assertTrue(Palindrome.isPalindrome("a"));
    }

    @Test
    void shouldReturnFalseWhenCharactersDiffer() {
        assertFalse(Palindrome.isPalindrome("ab"));
    }
}