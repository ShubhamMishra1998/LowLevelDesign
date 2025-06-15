package com.lld.multithreading.interviewquestions.fizzbuzz;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        Thread fizz = new Thread(() -> {
            try {
                fizzBuzz.fizz(()->System.out.println("Fizz"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });


        Thread buzz = new Thread(() -> {
            try {
                fizzBuzz.buzz(()->System.out.println("Buzz"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread fizzbuzz = new Thread(() -> {
            try {
                fizzBuzz.fizzbuzz(() -> System.out.println("FizzBuzz"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread number = new Thread(() -> {
            try {
                fizzBuzz.number((x)->System.out.println(x));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        fizz.start();
        buzz.start();
        fizzbuzz.start();
        number.start();
    }
}
