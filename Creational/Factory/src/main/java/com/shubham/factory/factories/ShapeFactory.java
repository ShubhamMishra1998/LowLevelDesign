package com.shubham.factory.factories;

import com.shubham.factory.shapes.Shape;

public abstract class ShapeFactory {
    private Shape shape;


    public abstract Shape getShape(String shapeType);

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
}
