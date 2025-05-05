package com.lld.structural.decorator.component;

public class Coffee extends Beverage {

    @Override
    public int cost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Coffee";
    }
}
