package com.lld.multithreading.interviewquestions.implementdeadlock.example;

public class Task1 implements Runnable {

    private Pen pen;
    private Paper paper;

    public Task1(Pen pen, Paper paper) {
        this.paper = paper;
        this.pen = pen;
    }

    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper);
    }
}
