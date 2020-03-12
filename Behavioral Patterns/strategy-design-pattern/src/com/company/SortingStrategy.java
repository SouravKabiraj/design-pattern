package com.company;

import java.util.ArrayList;

public abstract class SortingStrategy<T> implements IStrategy {
    public abstract ArrayList<T> sort(ArrayList<T> list);
}
