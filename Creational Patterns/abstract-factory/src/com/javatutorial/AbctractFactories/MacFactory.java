package com.javatutorial.AbctractFactories;

import com.javatutorial.AbctractProducts.IBrand;
import com.javatutorial.AbctractProducts.IComputerFactory;
import com.javatutorial.ConcreteProducts.Mac;

public abstract class MacFactory implements IComputerFactory {
    @Override
    public IBrand Brand() {
        return new Mac();
    }
}
