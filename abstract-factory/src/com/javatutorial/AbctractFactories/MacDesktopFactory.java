package com.javatutorial.AbctractFactories;

import com.javatutorial.ConcreteProducts.Desktop;
import com.javatutorial.AbctractProducts.ISystemType;

public abstract class MacDesktopFactory extends MacFactory {
    @Override
    public ISystemType SystemType() {
        return new Desktop();
    }
}
