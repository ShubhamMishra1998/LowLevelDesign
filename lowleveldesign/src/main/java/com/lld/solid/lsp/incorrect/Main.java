package com.lld.solid.lsp.incorrect;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(5);
        System.out.println(rectangle.getArea());

        Rectangle sqaure = new Square();
        sqaure.setWidth(10);
        sqaure.setHeight(5);
        System.out.println(sqaure.getArea());//It produces wrong result as it is not a square.
    }
}
