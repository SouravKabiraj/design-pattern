package com.javatutorial.ConcreteFactories;

import com.javatutorial.ConcreteProducts.I7;
import com.javatutorial.AbctractProducts.IProcessor;
import com.javatutorial.AbctractFactories.MacLaptopFactory;

public class MacI7LaptopFactory extends MacLaptopFactory {
    @Override
    public IProcessor Processor() {
        return new I7();
    }
}
