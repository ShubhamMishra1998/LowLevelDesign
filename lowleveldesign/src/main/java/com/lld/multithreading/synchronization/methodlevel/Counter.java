package com.lld.multithreading.synchronization.methodlevel;

public class Counter implements Runnable {
    private int counter;

    public Counter(int counter) {
        this.counter = counter;
    }

    public synchronized void increment() {
        System.out.println(Thread.currentThread().getName() +  " is incrementing counter");
        counter++;
        System.out.println( "Thread "+ Thread.currentThread().getName() + " Value after increment " + counter);

        System.out.println(Thread.currentThread().getName() + " is finished increment");
    }


    @Override
    public void run() {
        increment();
    }
}
