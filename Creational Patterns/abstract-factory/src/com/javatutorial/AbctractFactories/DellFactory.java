package com.javatutorial.AbctractFactories;

import com.javatutorial.ConcreteProducts.Dell;
import com.javatutorial.AbctractProducts.IBrand;
import com.javatutorial.AbctractProducts.IComputerFactory;

public abstract class DellFactory implements IComputerFactory {
    @Override
    public IBrand Brand() {
        return new Dell();
    }
}
