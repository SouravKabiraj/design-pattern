package com.javatutorial;

public class BridgeAdder<T> extends AbstractAdder<T> {
    @Override
    public T Add(T a, T b) {
        return super.Add(a, b);
    }
}
