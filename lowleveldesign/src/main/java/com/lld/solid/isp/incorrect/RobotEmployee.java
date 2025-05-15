package com.lld.solid.isp.incorrect;

/**
 * Here this class is not following the interface segregation principle as it implements the eat() method which is not required.
 */
public class RobotEmployee implements Employee {
    @Override
    public void work() {
        System.out.println("Robot employee works");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException();
    }
}
