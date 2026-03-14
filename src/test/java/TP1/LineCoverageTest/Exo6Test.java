package TP1.LineCoverageTest;

import org.junit.jupiter.api.Test;
import TP1.FizzBuzz;

import static org.junit.jupiter.api.Assertions.*;

public class Exo6Test {

    @Test
    void invalidValueShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(0));
    }
    @Test
    void validValueShouldNotThrow() {
        assertDoesNotThrow(() -> FizzBuzz.fizzBuzz(1));
    }
    
    @Test
    void divisibleBy15ShouldReturnFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    void divisibleBy3ShouldReturnFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
    }

    @Test
    void divisibleBy5ShouldReturnBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    void otherNumberShouldReturnStringValue() {
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }
}