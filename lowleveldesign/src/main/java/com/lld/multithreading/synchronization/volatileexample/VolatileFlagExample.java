package com.lld.multithreading.synchronization.volatileexample;

public class VolatileFlagExample implements Runnable {
    private volatile boolean flag = false;
    private int counter = 0;

    public VolatileFlagExample() {
        this.flag = true;
        this.counter = 0;
    }

    private void increment() {
        while (flag) {
            counter++;
        }
    }

    @Override
    public void run() {
        increment();
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
