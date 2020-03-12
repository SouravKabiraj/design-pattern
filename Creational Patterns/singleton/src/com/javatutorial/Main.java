package com.javatutorial;

public class Main {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        int count = Singleton.getCount();
        instance2.print("Count "+count);
    }
}
