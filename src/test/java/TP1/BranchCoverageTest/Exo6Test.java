package TP1.BranchCoverageTest;

import org.junit.jupiter.api.Test;
import TP1.FizzBuzz;

import static org.junit.jupiter.api.Assertions.*;

public class Exo6Test {

    @Test
    void shouldThrowWhenValueIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(-1));
    }
    @Test
    void shouldNotThrowWhenValueIsValid() {
        assertDoesNotThrow(() -> FizzBuzz.fizzBuzz(1));
    }

    @Test
    void shouldTakeFizzBuzzBranch() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }

    @Test
    void shouldTakeFizzBranch() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
    }

    @Test
    void shouldTakeBuzzBranch() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(20));
    }

    @Test
    void shouldTakeDefaultBranch() {
        assertEquals("8", FizzBuzz.fizzBuzz(8));
    }
}