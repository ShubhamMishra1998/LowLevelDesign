package com.lld.multithreading.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private Lock lock = new ReentrantLock();
    private int balance = 100;

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " is trying to withdraw " + amount);

        try {
            if(lock.tryLock()) {
                if(balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " is withdrawing the amount " + amount);
                        Thread.sleep(5000);
                        balance-=amount;
                        System.out.println(Thread.currentThread().getName() + " completed the withdrawn and balance is " + balance);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock will try bit later");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
