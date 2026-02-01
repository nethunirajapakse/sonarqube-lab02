package com.example;

public class Calculator {

    public enum Operation {
        ADD, SUB, MUL, DIV, MOD, POW
    }

    public int calculate(int a, int b, Operation op) {

        return switch (op) {
            case ADD -> a + b;
            case SUB -> a - b;
            case MUL -> a * b;
            case DIV -> {
                if (b == 0) {
                    throw new IllegalArgumentException("Division by zero");
                }
                yield a / b;
            }
            case MOD -> a % b;
            case POW -> power(a, b);
        };
    }

    private int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
