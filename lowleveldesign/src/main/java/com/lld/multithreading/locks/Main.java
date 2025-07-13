package com.lld.multithreading.locks;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Runnable runable1 = new Runnable() {
            @Override
            public void run() {
                bankAccount.withdraw(50);
            }
        };

        Runnable runable2 = new Runnable() {
            @Override
            public void run() {
                bankAccount.withdraw(50);
            }
        };

        Thread t1 = new Thread(runable1,"Thread1");
        Thread t2 = new Thread(runable2, "Thread2");

        t1.start();
        t2.start();

        try {
            t2.join();
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
