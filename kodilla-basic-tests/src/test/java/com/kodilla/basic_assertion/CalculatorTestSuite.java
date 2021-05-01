package com.kodilla.basic_assertion;

import com.kodilla.abstracts.basic_assertion.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
   @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        int a = 2;
        int squareResult = calculator.square(a);
        assertEquals(4, squareResult);
    }
}