package com.shubham.duck;

import com.shubham.duck.behaviours.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
