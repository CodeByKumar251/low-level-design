package com.lowleveldesign.pattern.creational.factory.factoryMethodPattern.example1.factory;

import com.lowleveldesign.pattern.creational.factory.factoryMethodPattern.example1.service.Shape;
import com.lowleveldesign.pattern.creational.factory.factoryMethodPattern.example1.service.Square;

public class SquareFactory implements  ShapeFactory {

    private double side;

    public SquareFactory(double side) {
        this.side = side;
    }

    @Override
    public Shape createShape() {
        return new Square(side);
    }
}
