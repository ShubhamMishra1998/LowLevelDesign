package com.shubham.factory.factories;

import com.shubham.factory.shapes.Circle;
import com.shubham.factory.shapes.Shape;
import com.shubham.factory.shapes.Square;
import com.shubham.factory.shapes.Triangle;

public class DefaultShapeFactory extends ShapeFactory {
    @Override
    public Shape getShape(String shapeType) {
        return switch (shapeType) {
            case "CIRCLE" -> new Circle();
            case "SQUARE" -> new Square();
            case "TRIANGLE" -> new Triangle();
            default -> null;
        };
    }
}
