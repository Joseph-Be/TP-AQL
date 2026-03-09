package TP1.LineCoverageTest;

import org.junit.jupiter.api.Test;
import TP1.Palindrome;

import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {

    @Test
    void nullString() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }

    @Test
    void singleLetter() {
        assertTrue(Palindrome.isPalindrome("a"));
    }
    @Test
    void palindrome() {
        assertTrue(Palindrome.isPalindrome("kayak"));
    }
    @Test
    void nonPalindrome() {
        assertFalse(Palindrome.isPalindrome("bonjour"));
    }
}