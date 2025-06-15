package com.lld.multithreading.interviewquestions.fizzbuzz;

import java.util.function.IntConsumer;

public class FizzBuzz {
    private final int n;
    private int i;

    public FizzBuzz(int n) {
        this.n = n;
        this.i = 1;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while (i <= n) {
            synchronized (this) {
                while ((i % 3 != 0 || i % 5 == 0) && (i<=n)) {
                    wait();
                }
                if(i<=n) {
                    printFizz.run();
                }
                this.i++;
                notifyAll();
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while (i <= n) {
            synchronized (this) {
                while ((i % 5 != 0 || i % 3 == 0) && (i<=n)) {
                    wait();
                }
                if(i<=n) {
                    printBuzz.run();
                }
                this.i++;
                notifyAll();
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (i <= n) {
            synchronized (this) {
                while ((i % 5 != 0 || i % 3 != 0) && (i<=n)) {
                    wait();
                }
                if(i<=n) {
                    printFizzBuzz.run();
                }
                this.i++;
                notifyAll();
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        while (i <= n) {
            synchronized (this) {
                while ((i % 5 == 0 || i % 3 == 0) && (i<=n)) {
                    wait();
                }
                if(i<=n) {
                    printNumber.accept(i);
                }
                this.i++;
                notifyAll();
            }
        }
    }
}
