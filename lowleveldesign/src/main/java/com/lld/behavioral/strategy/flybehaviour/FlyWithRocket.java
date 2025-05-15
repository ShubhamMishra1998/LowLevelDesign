package com.lld.behavioral.strategy.flybehaviour;


class FlyWithRocket implements Flyable {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
