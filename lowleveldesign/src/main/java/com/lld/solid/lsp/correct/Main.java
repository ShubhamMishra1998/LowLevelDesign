package com.lld.solid.lsp.correct;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10,5);
        System.out.println(rectangle.getArea());

        Shape square = new Square(10);
        System.out.println(square.getArea());


    }
}
