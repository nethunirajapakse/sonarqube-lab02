package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addWorks() {
        Calculator c = new Calculator();
        assertEquals(5,
                c.calculate(2, 3, Calculator.Operation.ADD));
    }
}
