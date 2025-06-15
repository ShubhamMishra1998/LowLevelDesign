package com.lld.multithreading.synchronization.blocklevel;

public class Counter implements Runnable{
    private int counter;
    private final Object lock = new Object();

    public Counter(int counter) {
        this.counter = counter;
    }

    public void counter() {
        System.out.println(Thread.currentThread().getName() + " is entered counter method " + counter);

        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " is increment counter variable");
            counter++;
        }
        System.out.println(Thread.currentThread().getName() + " is completed incremented counter variable " + counter);
    }

    @Override
    public void run() {
        counter();
    }

    public int getCounter() {
        return counter;
    }
}
