package com.javatutorial.ConcreteFactories;

import com.javatutorial.ConcreteProducts.I5;
import com.javatutorial.AbctractProducts.IProcessor;
import com.javatutorial.AbctractFactories.DellDesktopFactory;

public class DellI5DesktopFactory extends DellDesktopFactory {
    @Override
    public IProcessor Processor() {
        return new I5();
    }
}
