package com.lld.multithreading.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockFairness {
    private final Lock lock = new ReentrantLock(true);
    public void accessResource() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired the lock ");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName() + " releases the lock ");
            lock.unlock();
        }
    }
}
