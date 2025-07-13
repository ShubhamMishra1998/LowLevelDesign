package com.lld.multithreading.interviewquestions.implementdeadlock.example;

public class Task2 implements Runnable {

    private Pen pen;
    private Paper paper;

    public Task2(Pen pen, Paper paper) {
        this.paper = paper;
        this.pen = pen;
    }

    @Override
    public void run() {
        paper.finishWriting();

        // how to fix the deadlock.
//        synchronized (pen) {
//            paper.writeWithPaperAndPen(pen);
//        }
    }
}
