package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void addWorks() {
        assertEquals(5, calculator.calculate(2, 3, Calculator.Operation.ADD));
    }

    @Test
    void subWorks() {
        assertEquals(1, calculator.calculate(4, 3, Calculator.Operation.SUB));
    }

    @Test
    void mulWorks() {
        assertEquals(6, calculator.calculate(2, 3, Calculator.Operation.MUL));
    }

    @Test
    void divWorks() {
        assertEquals(2, calculator.calculate(6, 3, Calculator.Operation.DIV));
    }

    @Test
    void divByZeroReturnsZero() {
        assertEquals(0, calculator.calculate(6, 0, Calculator.Operation.DIV));
    }

    @Test
    void modWorks() {
        assertEquals(1, calculator.calculate(7, 3, Calculator.Operation.MOD));
    }

    @Test
    void powWorks() {
        assertEquals(8, calculator.calculate(2, 3, Calculator.Operation.POW));
    }

    @Test
    void defaultCaseReturnsZero() {
        assertEquals(0, calculator.calculate(1, 1, null));
    }
}
