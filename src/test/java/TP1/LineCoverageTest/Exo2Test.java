package TP1.LineCoverageTest;

import org.junit.jupiter.api.Test;
import TP1.Anagram;

import static org.junit.jupiter.api.Assertions.*;

public class Exo2Test {

    @Test
    void nullString() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "abc"));
    }

    @Test
    void differentLength() {
        assertFalse(Anagram.isAnagram("abc", "ab"));
    }

    @Test
    void validAnagram() {
        assertTrue(Anagram.isAnagram("listen", "silent"));
    }

    @Test
    void notAnagram() {
        assertFalse(Anagram.isAnagram("hello", "world"));
    }
}