package com.shubham.duck;

import com.shubham.duck.behaviours.FlyNoFly;
import com.shubham.duck.behaviours.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNoFly();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
