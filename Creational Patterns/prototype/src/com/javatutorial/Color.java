package com.javatutorial;

public class Color extends ColorPrototype {
    private int red;
    private int green;
    private int blue;

    Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public ColorPrototype clone() {
        Color color = new Color(red, green, blue);
        return (ColorPrototype) color;
    }
}
