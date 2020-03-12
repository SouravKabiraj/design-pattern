package com.company;

public class Honey extends IceCreamDecorator {
    Honey(IIceCream iceCream) {
        super(iceCream);
    }

    @Override
    public int getToppingsPrice() {
        return 5;
    }
}
