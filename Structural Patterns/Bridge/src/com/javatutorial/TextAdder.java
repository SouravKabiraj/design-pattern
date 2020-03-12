package com.javatutorial;

public class TextAdder implements Adder<String> {

    @Override
    public String Add(String a, String b) {
        return a + " " + b;
    }
}
