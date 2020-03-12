package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        ArrayList<CalculatorCommand> calculatorCommands = new ArrayList<>();
        calculatorCommands.add(new CalculatorCommand(calculator, '+', 4));
        calculatorCommands.add(new CalculatorCommand(calculator, '-', 3));
        calculatorCommands.add(new CalculatorCommand(calculator, '*', 4));
        calculatorCommands.add(new CalculatorCommand(calculator, '/', 2));

        User user = new User(calculator, calculatorCommands);

        user.computeNextCommand();
        user.computeNextCommand();
        user.computeNextCommand();
        user.computeNextCommand();
        user.undoLastCompute();
        user.undoLastCompute();
        user.undoLastCompute();
        user.computeNextCommand();
    }
}
