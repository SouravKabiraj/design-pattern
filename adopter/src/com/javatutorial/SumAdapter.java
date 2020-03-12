package com.javatutorial;

public class SumAdapter {
    public int performAdd(int a, int b) {
        return new ThreeNumberSum().performAdd(a, b, 0);
    }
}
