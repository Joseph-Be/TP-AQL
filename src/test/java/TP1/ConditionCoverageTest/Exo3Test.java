package TP1.ConditionCoverageTest;

import org.junit.jupiter.api.Test;
import TP1.BinarySearch;

import static org.junit.jupiter.api.Assertions.*;

public class Exo3Test {

    @Test
    void nullConditionTrue() {
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 2));
    }

    @Test
    void whileConditionFalseImmediately() {
        int[] array = {};
        assertEquals(-1, BinarySearch.binarySearch(array, 2));
    }

    @Test
    void equalityConditionTrue() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(2, BinarySearch.binarySearch(array, 5));
    }

    @Test
    void lessOrEqualConditionTrue() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearch.binarySearch(array, 8));
    }

    @Test
    void lessOrEqualConditionFalse() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearch.binarySearch(array, 0));
    }
}