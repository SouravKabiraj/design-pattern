package com.javatutorial.ConcreteProducts;

import com.javatutorial.AbctractProducts.IProcessor;
import com.javatutorial.Models.Processor;

public class I7 implements IProcessor {
    @Override
    public Processor getProcessor() {
        return Processor.I7;
    }
}
