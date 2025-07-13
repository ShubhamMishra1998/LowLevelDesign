package com.lld.multithreading.interviewquestions.implementdeadlock.example;

public class Pen {

    public synchronized void writeWithPenAndPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName() + " has acquired Pen Lock and trying to acquire paper lock");
        paper.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished writing");
    }
}
