package com.lld.structural.decorator;

import com.lld.structural.decorator.component.Beverage;
import com.lld.structural.decorator.component.Coffee;
import com.lld.structural.decorator.decorator.Milk;
import com.lld.structural.decorator.decorator.Sugar;

public class Main {
    public static void main(String[] args) {

        Beverage beverage = new Coffee();
        beverage = new Milk(beverage);
        beverage = new Sugar(beverage);

        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());



    }
}
