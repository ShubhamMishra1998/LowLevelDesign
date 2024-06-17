package com.shubham.duck.behaviours;

public class FlyNoFly implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
