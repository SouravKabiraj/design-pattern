package com.javatutorial;

public interface IBuilder<T> {
    public IBuilder initiate();
    public T build();
}
