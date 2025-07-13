package com.lld.multithreading.locks;

public class MainFaireness {
    public static void main(String[] args) {
        LockFairness lockFairness = new LockFairness();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                lockFairness.accessResource();
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                lockFairness.accessResource();
            }
        };

        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                lockFairness.accessResource();
            }
        };

        Thread t1 = new Thread(r1, "Thread 1");
        Thread t2 = new Thread(r2, "Thread 2");
        Thread t3 = new Thread(r3, "Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
