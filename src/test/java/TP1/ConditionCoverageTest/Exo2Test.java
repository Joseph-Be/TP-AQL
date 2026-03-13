package TP1.ConditionCoverageTest;

import org.junit.jupiter.api.Test;
import TP1.Anagram;

import static org.junit.jupiter.api.Assertions.*;

public class Exo2Test {

    @Test
    void bothNull() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, null));
    }

    @Test
    void oneNull() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("abc", null));
    }

    @Test
    void validAnagram() {
        assertTrue(Anagram.isAnagram("chien", "niche"));
    }

    @Test
    void invalidAnagram() {
        assertFalse(Anagram.isAnagram("chat", "chien"));
    }
}