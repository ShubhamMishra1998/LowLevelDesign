package com.shubham.decorator.beverage;

public class Cappuccino implements Beverage {

    @Override
    public String description() {
        return "Cappuccino";
    }

    @Override
    public int cost() {
        return 10;
    }
}
