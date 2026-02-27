package com.lowleveldesign.pattern.creational.factory.factoryMethodPattern.example1.factory;
import com.lowleveldesign.pattern.creational.factory.factoryMethodPattern.example1.service.Rectangle;
import com.lowleveldesign.pattern.creational.factory.factoryMethodPattern.example1.service.Shape;

public class RectangleFactory implements ShapeFactory {

    private double length;
    private double breadth;

    public RectangleFactory(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public Shape createShape() {
        /*
        This method is responsible for creating and returning an instance of the Rectangle class.
         */
        return new Rectangle(length, breadth);
    }
}
