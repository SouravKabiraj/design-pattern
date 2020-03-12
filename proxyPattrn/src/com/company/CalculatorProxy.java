package com.company;

public class CalculatorProxy implements ICalculator {
    private Calculator calculator;

    public CalculatorProxy() {
        calculator = new Calculator();
    }

    @Override
    public int add(int a, int b) {
        return calculator.add(a, b);
    }

    @Override
    public int sub(int a, int b) {
        return calculator.sub(a, b);
    }

    @Override
    public int mul(int a, int b) {
        return calculator.mul(a, b);
    }

    @Override
    public int div(int a, int b) {
        return calculator.div(a, b);
    }
}
