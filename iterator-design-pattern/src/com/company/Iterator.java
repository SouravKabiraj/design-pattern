package com.company;

public class Iterator implements IIterator<String> {
    private String[] list = new String[100];
    private int lastIndex = -1;
    private int index = 0;

    @Override
    public String First() {
        return list[0];
    }

    @Override
    public String Next() {
        index++;
        return list[index];
    }

    @Override
    public void add(String s) {
        lastIndex++;
        list[lastIndex] = s;
    }

    @Override
    public Boolean IsDone() {
        return index == lastIndex;
    }

    @Override
    public String CurrentItem() {
        return list[index];
    }
}
