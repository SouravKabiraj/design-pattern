package com.javatutorial;

public class NumberAdder implements Adder<Integer> {
    @Override
    public Integer Add(Integer a, Integer b) {
        return a + b;
    }
}
