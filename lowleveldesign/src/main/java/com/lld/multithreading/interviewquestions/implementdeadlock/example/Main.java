package com.lld.multithreading.interviewquestions.implementdeadlock.example;

public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();
        Task1 task1 = new Task1(pen, paper);
        Task2 task2 = new Task2(pen, paper);

        Thread t1 = new Thread(task1, "Thread1");
        Thread t2 = new Thread(task2, "Thread2");

        t1.start();
        t2.start();

    }
}
