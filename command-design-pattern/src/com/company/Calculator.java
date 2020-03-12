package com.company;

public class Calculator {
    private int currentValue = 0;

    public int execute(char op, int value) {
        switch (op) {
            case '+':
                currentValue = currentValue + value;
                break;
            case '-':
                currentValue = currentValue - value;
                break;
            case '*':
                currentValue = currentValue * value;
                break;
            case '/':
                currentValue = currentValue / value;
                break;
        }
        return currentValue;
    }
}
