package com.company;

public abstract class Database<T> {
    public void update(T t) {
        T t1 = get();
        if (t1 != t) {
            set(t);
        }
    }

    protected abstract T get();

    protected abstract void set(T t);
}
