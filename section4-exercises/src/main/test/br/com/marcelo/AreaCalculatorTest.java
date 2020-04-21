package br.com.marcelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaCalculatorTest {

    @Test
    void areaNegative() {
        assertEquals(-1.0, AreaCalculator.area(-1));
    }

    @Test
    void testArea() {
        assertEquals(1.0, AreaCalculator.area(1, 1));
    }
}