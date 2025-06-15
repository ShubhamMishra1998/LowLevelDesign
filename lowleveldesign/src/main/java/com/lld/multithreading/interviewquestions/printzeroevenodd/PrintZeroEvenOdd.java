package com.lld.multithreading.interviewquestions.printzeroevenodd;

import java.util.function.IntConsumer;

public class PrintZeroEvenOdd {

    private int n;
    private int STATE;
    private final int ZERO = 0;
    private final int EVEN = 2;
    private final int ODD = 1;


    public PrintZeroEvenOdd(int n) {
        this.n = n;
        this.STATE = ZERO;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {

        for(int i=1;i<=n;i++) {
            synchronized (this) {
                while (this.STATE != ZERO) {
                    wait();
                }
                printNumber.accept(0);

                this.STATE = i%2 == 0 ? EVEN : ODD;

                notifyAll();
            }
        }

    }

    public void even(IntConsumer printNumber) throws InterruptedException {

        for(int i=2;i<=n;i+=2) {
            synchronized (this) {
                while (this.STATE != EVEN) {
                    wait();
                }
                printNumber.accept(i);

                this.STATE = ZERO;
                notifyAll();
            }
        }

    }

    public void odd(IntConsumer printNumber) throws InterruptedException {

        for(int i=1;i<=n;i+=2) {
            synchronized (this) {
                while (this.STATE != ODD) {
                    wait();
                }
                printNumber.accept(i);

                this.STATE = ZERO;
                notifyAll();
            }
        }

    }
}
