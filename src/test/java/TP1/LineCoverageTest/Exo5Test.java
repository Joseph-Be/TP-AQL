package TP1.LineCoverageTest;

import org.junit.jupiter.api.Test;
import TP1.RomanNumeral;

import static org.junit.jupiter.api.Assertions.*;

public class Exo5Test {

    @Test
    void belowRangeShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0));
    }

    @Test
    void aboveRangeShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
    }

    @Test
    void simpleValueShouldRevealBug() {
        assertEquals("I", RomanNumeral.toRoman(1));
    }

    @Test
    void subtractionCaseShouldRevealBug() {
        assertEquals("IV", RomanNumeral.toRoman(4));
    }
}