package com.shubham.decorator.beverage.decorators;

import com.shubham.decorator.beverage.Beverage;

public class Milk extends AddOnsDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return getBeverage().description() + " Milk";
    }

    @Override
    public int cost() {
        return getBeverage().cost() + 5;
    }
}
