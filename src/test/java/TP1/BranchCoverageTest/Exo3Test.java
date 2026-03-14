package TP1.BranchCoverageTest;

import org.junit.jupiter.api.Test;
import TP1.BinarySearch;

import static org.junit.jupiter.api.Assertions.*;

public class Exo3Test {

    @Test
    void nullArrayShouldThrow() {
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 1));
    }

    @Test
    void shouldFindMiddleElement() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(2, BinarySearch.binarySearch(array, 5));
    }

    @Test
    void shouldGoRightAndReturnMinusOne() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearch.binarySearch(array, 8));
    }

    @Test
    void shouldGoLeftAndReturnMinusOne() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearch.binarySearch(array, 0));
    }
}