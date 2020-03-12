package com.javatutorial.ConcreteProducts;

import com.javatutorial.AbctractProducts.ISystemType;
import com.javatutorial.Models.SystemType;

public class Laptop implements ISystemType {
    @Override
    public SystemType getSystemType() {
        return SystemType.LAPTOP;
    }
}
