package com.lld.structural.decorator.decorator;

import com.lld.structural.decorator.component.Beverage;

public class Sugar extends CondementDecorator {

    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    @Override
    public int cost() {
        return 5 + beverage.cost();
    }
}
