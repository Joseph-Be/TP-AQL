package TP1.ConditionCoverageTest;

import org.junit.jupiter.api.Test;
import TP1.FizzBuzz;

import static org.junit.jupiter.api.Assertions.*;

public class Exo6Test {

    @Test
    void conditionNLessOneTrue() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(0));
    }
    @Test
    void conditionNLessOneFalse() {
        assertDoesNotThrow(() -> FizzBuzz.fizzBuzz(1));
    }

    @Test
    void conditionModulo15True() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    void conditionModulo3TrueAndModulo15False() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    void conditionModulo5TrueAndPreviousConditionsFalse() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    void allConditionsFalse() {
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }
}