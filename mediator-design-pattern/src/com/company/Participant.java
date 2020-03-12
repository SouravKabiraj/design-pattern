package com.company;

public class Participant {
    private String name;

    public Participant(String name) {
        this.name = name;
    }

    void notify(String text) {
        System.out.println(name + " recived: " + text);
    }
}
