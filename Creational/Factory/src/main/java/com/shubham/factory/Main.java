package com.shubham.factory;

import com.shubham.factory.factories.DefaultShapeFactory;
import com.shubham.factory.factories.ShapeFactory;
import com.shubham.factory.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new DefaultShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        shape1 = shapeFactory.getShape("SQUARE");
        shape1.draw();
        shape1 = shapeFactory.getShape("TRIANGLE");
        shape1.draw();
    }
}
