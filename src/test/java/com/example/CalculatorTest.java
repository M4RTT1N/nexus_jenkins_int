package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3), "5 - 3 should equal 2");
    }

    @Test
    void testMultiply() {
        assertEquals(15, calculator.multiply(3, 5), "3 * 5 should equal 15");
    }
}