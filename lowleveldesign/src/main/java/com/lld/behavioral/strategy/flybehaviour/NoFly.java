package com.lld.behavioral.strategy.flybehaviour;


class NoFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
