package com.shubham.decorator.beverage.decorators;

import com.shubham.decorator.beverage.Beverage;

public class Sugar extends AddOnsDecorator {

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String description() {
        return getBeverage().description() + " Sugar";
    }

    @Override
    public int cost() {
        return getBeverage().cost() + 2;
    }
}
