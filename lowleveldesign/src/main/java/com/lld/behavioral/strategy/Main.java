package com.lld.behavioral.strategy;

import com.lld.behavioral.strategy.duck.Duck;
import com.lld.behavioral.strategy.duck.MallaredDuck;
import com.lld.behavioral.strategy.flybehaviour.FlyWithWings;
import com.lld.behavioral.strategy.quackbehaviour.NormalQuack;

public class Main {

    public static void main(String[] args) {
        Duck mallaredDuck = new MallaredDuck(new FlyWithWings(), new NormalQuack());
        mallaredDuck.fly();
        mallaredDuck.quack();
    }
}
