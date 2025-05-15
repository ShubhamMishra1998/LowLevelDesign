package com.lld.solid.lsp.correct;

public class Square implements Shape{
    int width;

    public Square(int width) {
        this.width = width;
    }


    @Override
    public int getArea() {
        return width * width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
