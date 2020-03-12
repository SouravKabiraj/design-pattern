package com.company;

import java.util.ArrayList;

public class User {
    private int currentCommand;
    private ArrayList<CalculatorCommand> calculatorCommands;

    public User(Calculator calculator, ArrayList<CalculatorCommand> calculatorCommands) {
        currentCommand = -1;
        this.calculatorCommands = calculatorCommands;
    }

    public void computeNextCommand() {
        currentCommand++;
        CalculatorCommand calculatorCommand = calculatorCommands.get(currentCommand);
        calculatorCommand.execute();
    }

    public void undoLastCompute() {
        CalculatorCommand calculatorCommand = calculatorCommands.get(currentCommand);
        calculatorCommand.unexecute();
        currentCommand--;
    }
}
