package com.javatutorial.AbctractFactories;

import com.javatutorial.ConcreteProducts.Desktop;
import com.javatutorial.AbctractProducts.ISystemType;

public abstract class DellDesktopFactory extends DellFactory {
    @Override
    public ISystemType SystemType() {
        return new Desktop();
    }
}
