package com.example.calculator;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void shouldAddNumbers() {
        assertEquals(15,
            calculator.calculate(10, 5, Calculator.Operation.ADD));
    }

    @Test
    void shouldThrowOnDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () ->
            calculator.calculate(10, 0, Calculator.Operation.DIV));
    }
}
