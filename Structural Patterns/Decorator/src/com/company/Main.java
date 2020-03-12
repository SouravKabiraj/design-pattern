package com.company;

public class Main {

    public static void main(String[] args) {
        // While you have to create a sub-class. But Class is not inheritable
        IceCream iceCream = new IceCream();
        Honey honey = new Honey(iceCream);
        Chocolate chocolate = new Chocolate(honey);
        System.out.println(chocolate.getCost());
    }
}
