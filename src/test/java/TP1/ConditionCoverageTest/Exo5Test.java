package TP1.ConditionCoverageTest;

import org.junit.jupiter.api.Test;
import TP1.RomanNumeral;

import static org.junit.jupiter.api.Assertions.*;

public class Exo5Test {

    @Test
    void lowerBoundConditionTrue() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0));
    }

    @Test
    void upperBoundConditionTrue() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
    }

    @Test
    void rangeConditionFalse() {
        assertEquals("II", RomanNumeral.toRoman(2));
    }

    @Test
    void equalityCaseRevealsBug() {
        assertEquals("V", RomanNumeral.toRoman(5));
    }
}