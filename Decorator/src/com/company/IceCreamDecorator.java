package com.company;

public abstract class IceCreamDecorator implements IIceCream {

    private final IIceCream iceCream;

    IceCreamDecorator(IIceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return this.iceCream.getCost() + getToppingsPrice();
    }

    abstract int getToppingsPrice();
}
