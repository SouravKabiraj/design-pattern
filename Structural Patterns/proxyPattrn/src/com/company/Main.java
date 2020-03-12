package com.company;

public class Main {

    public static void main(String[] args) {
        int add = new CalculatorProxy().add(10, 9);
        System.out.println(add);
    }
}
