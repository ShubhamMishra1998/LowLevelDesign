package com.lld.multithreading.locks.readwrite;

public class Main {
    public static void main(String[] args) {
        ReadWriteLockExample readWriteLockExample = new ReadWriteLockExample();

        Runnable write = () -> {
            for(int i=0;i<10;i++) {
                System.out.println(Thread.currentThread().getName() + " is writing ");
                readWriteLockExample.increment();
            }
        };

        Runnable read = () -> {
            for(int i=0;i<10;i++) {
                System.out.println(Thread.currentThread().getName() + " is reading and value is " + readWriteLockExample.getCount());
            }
        };

        Thread t1 = new Thread(write, "WriteThread");
        Thread t2 = new Thread(read, "ReadThread");

        t1.start();
        t2.start();
    }
}
