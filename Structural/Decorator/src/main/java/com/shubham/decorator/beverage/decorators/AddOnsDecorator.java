package com.shubham.decorator.beverage.decorators;

import com.shubham.decorator.beverage.Beverage;

public abstract class AddOnsDecorator implements Beverage {
    Beverage beverage;

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
}
