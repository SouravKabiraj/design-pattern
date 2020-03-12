package com.javatutorial.ConcreteProducts;

import com.javatutorial.AbctractProducts.IProcessor;
import com.javatutorial.Models.Processor;

public class I5 implements IProcessor {

    @Override
    public Processor getProcessor() {
        return Processor.I5;
    }
}
