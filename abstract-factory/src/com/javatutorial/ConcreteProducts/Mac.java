package com.javatutorial.ConcreteProducts;

import com.javatutorial.AbctractProducts.IBrand;
import com.javatutorial.Models.Brand;

public class Mac implements IBrand {

    @Override
    public Brand getBrand() {
        return Brand.MAC;
    }
}
