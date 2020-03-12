package com.javatutorial.AbctractProducts;

public interface IComputerFactory {
    ISystemType SystemType();

    IBrand Brand();

    IProcessor Processor();
}
