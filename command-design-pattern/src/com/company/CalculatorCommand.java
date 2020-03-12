package com.company;

public class CalculatorCommand implements ICommand {
    private Calculator calculator;
    private char operation;
    private int operand;

    public CalculatorCommand(Calculator calculator, char operation, int operand) {
        this.calculator = calculator;
        this.operation = operation;
        this.operand = operand;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public int getOperand() {
        return operand;
    }

    public void setOperand(int operand) {
        this.operand = operand;
    }

    @Override
    public void execute() {
        int result = calculator.execute(operation, operand);
        System.out.println(result);
    }

    @Override
    public void unexecute() {
        int result = calculator.execute(undo(operation), operand);
        System.out.println(result);
    }

    private char undo(char operation) {
        switch (operation) {
            case '+':
                return '-';
            case '-':
                return '+';
            case '*':
                return '/';
            default:
                return '*';
        }
    }
}
