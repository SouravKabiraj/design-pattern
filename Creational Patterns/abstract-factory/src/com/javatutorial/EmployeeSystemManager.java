package com.javatutorial;

import com.javatutorial.AbctractProducts.IBrand;
import com.javatutorial.AbctractProducts.IComputerFactory;
import com.javatutorial.AbctractProducts.IProcessor;
import com.javatutorial.AbctractProducts.ISystemType;

public class EmployeeSystemManager {
    private IComputerFactory computerFactory;

    EmployeeSystemManager(IComputerFactory computerFactory) {
        this.computerFactory = computerFactory;
    }

    public String getSystemDetails() {
        IBrand brand = computerFactory.Brand();
        IProcessor processor = computerFactory.Processor();
        ISystemType systemType = computerFactory.SystemType();
        return String.format("brand %s, processor %s, systemType %s", brand.getBrand(), processor.getProcessor(), systemType.getSystemType());
    }
}
