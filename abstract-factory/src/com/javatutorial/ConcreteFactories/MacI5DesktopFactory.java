package com.javatutorial.ConcreteFactories;

import com.javatutorial.ConcreteProducts.I5;
import com.javatutorial.AbctractProducts.IProcessor;
import com.javatutorial.AbctractFactories.MacDesktopFactory;

public class MacI5DesktopFactory extends MacDesktopFactory {
    @Override
    public IProcessor Processor() {
        return new I5();
    }
}
