package com.lld.multithreading.interviewquestions.printzeroevenodd;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PrintZeroEvenOdd printZeroEvenOdd = new PrintZeroEvenOdd(5);

        Thread zero = new Thread(() -> {
            try {
                printZeroEvenOdd.zero((x)-> System.out.print(x));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread even = new Thread(() -> {
            try {
                printZeroEvenOdd.even((x)-> System.out.print(x));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread odd = new Thread(() -> {
            try {
                printZeroEvenOdd.odd((x)-> System.out.print(x));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        zero.start();
        even.start();
        odd.start();
    }
}
