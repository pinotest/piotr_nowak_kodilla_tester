package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator.subtract(a, b);
        assertEquals(-3, subResult);
    }
    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        double a = 5;
        double subResult = calculator.square(a);
        assertEquals(25, subResult);
    }
    @Test
    public void testSquareZero() {
        Calculator calculator = new Calculator();
        double a = 0;
        double subResult = calculator.square(a);
        assertEquals(0, subResult);
    }
    @Test
    public void testSquareBelowZero() {
        Calculator calculator = new Calculator();
        double a = -5.2;
        double subResult = calculator.square(a);
        assertEquals(27, subResult, 0.1);
    }

}
