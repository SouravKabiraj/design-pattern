package com.javatutorial;

public final class Singleton {
    private static Singleton instance;
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            count++;
            instance = new Singleton();
        }
        return instance;
    }

    public void print(String text) {
        System.out.println(text);
    }
}
