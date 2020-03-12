package com.javatutorial.AbctractFactories;

import com.javatutorial.AbctractProducts.ISystemType;
import com.javatutorial.ConcreteProducts.Laptop;

public abstract class MacLaptopFactory extends MacFactory {
    @Override
    public ISystemType SystemType() {
        return new Laptop();
    }
}
