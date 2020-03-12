package com.javatutorial;

public class Main {

    public static void main(String[] args) {
        Color color = new Color(1, 2, 3);
        ColorPrototype clonedColor1 = color.clone();
        ColorPrototype clonedColor2 = color.clone();
        ColorPrototype clonedColor3 = color.clone();
    }
}
