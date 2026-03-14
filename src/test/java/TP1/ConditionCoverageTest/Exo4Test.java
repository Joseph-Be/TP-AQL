package TP1.ConditionCoverageTest;

import org.junit.jupiter.api.Test;
import TP1.QuadraticEquation;

import static org.junit.jupiter.api.Assertions.*;

public class Exo4Test {

    @Test
    void conditionAEqualsZeroTrue() {
        assertThrows(IllegalArgumentException.class,
                () -> QuadraticEquation.solve(0, 1, 1));
    }

    @Test
    void conditionDeltaLessThanZeroTrue() {
        assertNull(QuadraticEquation.solve(1, 0, 1));
    }

    @Test
    void conditionDeltaEqualsZeroTrue() {
        double[] roots = QuadraticEquation.solve(1, 2, 1);
        assertEquals(1, roots.length);
        assertEquals(-1.0, roots[0], 0.000001);
    }

    @Test
    void conditionDeltaPositiveCase() {
        double[] roots = QuadraticEquation.solve(1, -3, 2);
        assertEquals(2, roots.length);
        assertEquals(2.0, roots[0], 0.000001);
        assertEquals(1.0, roots[1], 0.000001);
    }
}