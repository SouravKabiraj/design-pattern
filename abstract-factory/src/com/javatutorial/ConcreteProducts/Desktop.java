package com.javatutorial.ConcreteProducts;

import com.javatutorial.AbctractProducts.ISystemType;
import com.javatutorial.Models.SystemType;

public class Desktop implements ISystemType {
    @Override
    public SystemType getSystemType() {
        return SystemType.DESKTOP;
    }
}
