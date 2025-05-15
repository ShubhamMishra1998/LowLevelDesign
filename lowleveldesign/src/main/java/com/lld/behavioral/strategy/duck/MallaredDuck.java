package com.lld.behavioral.strategy.duck;

import com.lld.behavioral.strategy.flybehaviour.Flyable;
import com.lld.behavioral.strategy.quackbehaviour.Quackable;

public class MallaredDuck extends Duck{

    public MallaredDuck(Flyable flyable, Quackable quackable) {
        this.flyable = flyable;
        this.quackable = quackable;
    }

    @Override
    public void display() {
        System.out.println("I  am a mallared duck");
    }
}
