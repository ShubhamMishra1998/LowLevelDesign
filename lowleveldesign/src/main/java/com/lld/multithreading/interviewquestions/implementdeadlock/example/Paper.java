package com.lld.multithreading.interviewquestions.implementdeadlock.example;

public class Paper {

    public synchronized void writeWithPaperAndPen(Pen pen) {
        System.out.println(Thread.currentThread().getName() + " has acquired Paper Lock and trying to acquire pen lock");
        pen.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished writing");
    }
}
