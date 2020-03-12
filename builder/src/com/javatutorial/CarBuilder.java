package com.javatutorial;

public class CarBuilder implements IBuilder<Car> {
    private Car car;

    public CarBuilder initiate() {
        this.car = new Car();
        return this;
    }

    public CarBuilder withEngine(Engine engine) {
        this.car.installEngine(engine);
        return this;
    }

    public CarBuilder withBreakingSystem(BreakingSystem breakingSystem) {
        this.car.installBreakingSystem(breakingSystem);
        return this;
    }

    public Car build() {
        return this.car;
    }
}