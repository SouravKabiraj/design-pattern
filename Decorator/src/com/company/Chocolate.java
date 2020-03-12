package com.company;

public class Chocolate extends IceCreamDecorator {
    Chocolate(IIceCream iceCream) {
        super(iceCream);
    }

    @Override
    int getToppingsPrice() {
        return 7;
    }
}
