package com.lld.behavioral.strategy.duck;

import com.lld.behavioral.strategy.flybehaviour.Flyable;
import com.lld.behavioral.strategy.quackbehaviour.Quackable;

public abstract class Duck {
    Flyable flyable;
    Quackable quackable;

    public void performFly() {
        flyable.fly();
    }

    public void performQuack() {
        quackable.quack();
    }

    public void fly() {
        flyable.fly();
    }

    public void quack() {
        quackable.quack();
    }

    public  abstract void display();

    public Flyable getFlyable() {
        return flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public Quackable getQuackable() {
        return quackable;
    }

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }
}
