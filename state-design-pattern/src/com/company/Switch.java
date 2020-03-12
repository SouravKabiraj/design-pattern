package com.company;

public class Switch {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void click() {
        state.handleChange(this);
    }

    public Switch(State state) {
        this.state = state;
    }
}
