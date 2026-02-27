package com.lowleveldesign.pattern.creational.factory.factoryMethodPattern.example1.util;

import com.lowleveldesign.pattern.creational.factory.factoryMethodPattern.example1.factory.CircleFactory;
import com.lowleveldesign.pattern.creational.factory.factoryMethodPattern.example1.factory.RectangleFactory;
import com.lowleveldesign.pattern.creational.factory.factoryMethodPattern.example1.factory.ShapeFactory;
import com.lowleveldesign.pattern.creational.factory.factoryMethodPattern.example1.factory.SquareFactory;
import com.lowleveldesign.pattern.creational.factory.factoryMethodPattern.example1.service.Shape;

public class ShapeFactoryMethod {

    public static Shape createShape(ShapeType shapeType, double... dimension) {
        Shape shape=null;
        switch (shapeType) {
            case CIRCLE:
                ShapeFactory circleFactory = new CircleFactory(dimension[0]);
                shape = circleFactory.createShape();
                break;
            case SQUARE:
                ShapeFactory squareFactory=new SquareFactory(dimension[0]);
                shape = squareFactory.createShape();
                break;
            case RECTANGLE:
                ShapeFactory rectangleFactory=new RectangleFactory(dimension[0],dimension[1]);
                shape = rectangleFactory.createShape();
                break;
            default:
                throw new IllegalArgumentException("Invalid shape type: " + shapeType);
        }

        return shape;
    }
}
