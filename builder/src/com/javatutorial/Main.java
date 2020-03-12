package com.javatutorial;

public class Main {

    public static void main(String[] args) {
        Car car = new CarBuilder().initiate().withBreakingSystem(new BreakingSystem()).withEngine(new Engine()).build();
        Car absCar = new CarBuilder().initiate().withBreakingSystem(new AutomatedBreakingSystem()).withEngine(new Engine()).build();
        System.out.println(car);
    }
}
