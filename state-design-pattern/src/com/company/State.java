package com.company;

public abstract class State<T> {
    public String name;

    public State(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void handleChange(T s);

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                '}';
    }
}
