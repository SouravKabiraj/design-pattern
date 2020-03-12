package com.javatutorial;

public class Main {

    public static void main(String[] args) {
        BridgeAdder numberAdderBridge = new BridgeAdder();
        numberAdderBridge.setImplementor(new NumberAdder());
        System.out.println(numberAdderBridge.Add(1, 2));

        BridgeAdder textAdderBridge = new BridgeAdder();
        textAdderBridge.setImplementor(new TextAdder());
        System.out.println(textAdderBridge.Add("Hello", "World!"));
    }
}
