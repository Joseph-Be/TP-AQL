package TP1.LineCoverageTest;

import org.junit.jupiter.api.Test;
import TP1.BinarySearch;

import static org.junit.jupiter.api.Assertions.*;

public class Exo3Test {

    @Test
    void nullArray() {
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 5));
    }

    @Test
    void elementFoundAtMid() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(2, BinarySearch.binarySearch(array, 5));
    }

    @Test
    void elementNotFound() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearch.binarySearch(array, 4));
    }

    @Test
    void elementFoundAtEnd() {
        int[] array = {1, 3, 5};
        assertEquals(2, BinarySearch.binarySearch(array, 5));
    }


}