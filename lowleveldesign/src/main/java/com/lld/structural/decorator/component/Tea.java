package com.lld.structural.decorator.component;

public class Tea extends Beverage {

    @Override
    public int cost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Tea";
    }
}
