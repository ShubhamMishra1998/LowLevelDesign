package com.shubham.decorator;

import com.shubham.decorator.beverage.Beverage;
import com.shubham.decorator.beverage.Cappuccino;
import com.shubham.decorator.beverage.decorators.Milk;
import com.shubham.decorator.beverage.decorators.Sugar;

public class Main {
    public static void main(String[] args) {
        Beverage beverage1 = new Cappuccino();

       beverage1 = new Sugar(beverage1);

       beverage1 = new Milk(beverage1);

       beverage1 = new Sugar(beverage1);

        System.out.println(beverage1.description());
        System.out.println(beverage1.cost());



    }
}
