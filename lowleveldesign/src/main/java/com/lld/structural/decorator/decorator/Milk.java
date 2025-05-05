package com.lld.structural.decorator.decorator;

import com.lld.structural.decorator.component.Beverage;

public class Milk extends CondementDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public int cost() {
        return 10 + beverage.cost();
    }
}
