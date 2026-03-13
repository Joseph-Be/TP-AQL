package TP1.BranchCoverageTest;

import org.junit.jupiter.api.Test;
import TP1.Anagram;

import static org.junit.jupiter.api.Assertions.*;

public class Exo2Test {

    @Test
    void nullInput() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, null));
    }

    @Test
    void differentLengths() {
        assertFalse(Anagram.isAnagram("abc", "abcd"));
    }

    @Test
    void anagramTrue() {
        assertTrue(Anagram.isAnagram("listen", "silent"));
    }

    @Test
    void anagramFalse() {
        assertFalse(Anagram.isAnagram("java", "python"));
    }
}