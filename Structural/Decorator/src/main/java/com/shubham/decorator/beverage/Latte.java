package com.shubham.decorator.beverage;

public class Latte implements Beverage {

    @Override
    public String description() {
        return "Latte";
    }

    @Override
    public int cost() {
        return 20;
    }
}
