package com.lld.structural.decorator.decorator;

import com.lld.structural.decorator.component.Beverage;

public abstract class CondementDecorator extends Beverage {
    Beverage beverage;

    public CondementDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String getDescription();

    public abstract int cost();
}
