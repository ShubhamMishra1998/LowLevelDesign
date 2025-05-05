package com.lld.structural.decorator.decorator;

import com.lld.structural.decorator.component.Beverage;

public class Sauce extends CondementDecorator {

    public Sauce(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Sauce";
    }

    @Override
    public int cost() {
        return 3 + beverage.cost();
    }
}
