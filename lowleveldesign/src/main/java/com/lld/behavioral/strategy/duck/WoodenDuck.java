package com.lld.behavioral.strategy.duck;

import com.lld.behavioral.strategy.flybehaviour.Flyable;
import com.lld.behavioral.strategy.quackbehaviour.Quackable;

public class WoodenDuck extends Duck{

    public WoodenDuck(Flyable flyable, Quackable quackable) {
        this.flyable = flyable;
        this.quackable = quackable;
    }

    @Override
    public void display() {
        System.out.println("I  am a wooden duck");
    }
}
