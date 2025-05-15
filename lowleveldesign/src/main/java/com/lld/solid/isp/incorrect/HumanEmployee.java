package com.lld.solid.isp.incorrect;

public class HumanEmployee implements Employee {
    @Override
    public void work() {
        System.out.println("Human employee works");
    }

    @Override
    public void eat() {
        System.out.println("Human employee eats");
    }
}
