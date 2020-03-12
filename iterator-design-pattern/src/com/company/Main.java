package com.company;

public class Main {

    public static void main(String[] args) {
        Iterator iterator = new Iterator();
        iterator.add("1");
        iterator.add("2");
        iterator.add("A");
        iterator.add("B");
        System.out.println(iterator.First());
        System.out.println(iterator.Next());
        System.out.println(iterator.Next());
        System.out.println(iterator.IsDone());
        System.out.println(iterator.Next());
        System.out.println(iterator.IsDone());
    }
}
