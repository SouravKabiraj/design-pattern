package com.javatutorial;

public abstract class AbstractAdder<T> {
    private Adder<T> implementor;

    public void setImplementor(Adder implementor) {
        this.implementor = implementor;
    }

    public T Add(T a, T b) {
        return implementor.Add(a, b);
    }
}
