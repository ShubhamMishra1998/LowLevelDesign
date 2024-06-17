package com.shubham.duck;

import com.shubham.duck.behaviours.FlyWithWings;
import com.shubham.duck.behaviours.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am Mallard duck");
    }
}
