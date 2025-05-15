package com.lld.solid.isp.correct;

public class HumanEmployee implements Eatable, Workable {
    @Override
    public void eat() {
        System.out.println("Human employee eats");
    }

    @Override
    public void work() {
        System.out.println("Human employee works");
    }
}
