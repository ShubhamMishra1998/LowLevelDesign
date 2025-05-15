package com.lld.behavioral.strategy.quackbehaviour;

public class NormalQuack implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
