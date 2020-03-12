package com.javatutorial;

public class Car {
    private Engine engine;
    private BreakingSystem breakingSystem;

    public void installEngine(Engine engine) {
        this.engine = engine;
    }

    public void installBreakingSystem(BreakingSystem breakingSystem) {
        this.breakingSystem = breakingSystem;
    }
}