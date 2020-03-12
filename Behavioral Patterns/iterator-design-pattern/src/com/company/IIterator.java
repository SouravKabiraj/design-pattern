package com.company;

public interface IIterator<T> {
    T First();

    T Next();

    void add(T s);

    Boolean IsDone();

    T CurrentItem();
}
