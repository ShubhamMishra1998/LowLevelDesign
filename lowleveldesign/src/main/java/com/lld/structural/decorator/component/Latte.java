package com.lld.structural.decorator.component;

public class Latte extends Beverage {

    @Override
    public int cost() {
        return 30;
    }

    @Override
    public String getDescription() {
        return "Latte";
    }
}
