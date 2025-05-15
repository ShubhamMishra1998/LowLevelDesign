package com.lld.behavioral.strategy.quackbehaviour;

public class MuteQuack implements Quackable {
    @Override
    public void quack() {
        System.out.println("I am mute duck so can't quack");
    }
}
