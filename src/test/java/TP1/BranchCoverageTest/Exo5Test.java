package TP1.BranchCoverageTest;

import org.junit.jupiter.api.Test;
import TP1.RomanNumeral;

import static org.junit.jupiter.api.Assertions.*;

public class Exo5Test {

    @Test
    void shouldThrowWhenTooSmall() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0));
    }

    @Test
    void shouldThrowWhenTooLarge() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(5000));
    }

    @Test
    void shouldEnterLoopForLargeNumber() {
        assertEquals("MM", RomanNumeral.toRoman(2000));
    }

    @Test
    void shouldHandleSubtractiveNotation() {
        assertEquals("IX", RomanNumeral.toRoman(9));
    }
}