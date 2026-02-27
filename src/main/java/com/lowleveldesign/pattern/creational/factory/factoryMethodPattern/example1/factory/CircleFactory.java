package com.lowleveldesign.pattern.creational.factory.factoryMethodPattern.example1.factory;

import com.lowleveldesign.pattern.creational.factory.factoryMethodPattern.example1.service.Circle;
import com.lowleveldesign.pattern.creational.factory.factoryMethodPattern.example1.service.Shape;

public class CircleFactory implements ShapeFactory {

    private double radius;

    public CircleFactory(double radius) {
        this.radius = radius;
    }

    @Override
    public Shape createShape() {
        /*
        logic to create circle can be complex and can involve multiple steps, but for simplicity we are just creating a circle with given radius. This is the main advantage of factory method pattern, it abstracts the creation logic and client code doesn't need to worry about it.
         */
        return new Circle(radius);
    }


}
