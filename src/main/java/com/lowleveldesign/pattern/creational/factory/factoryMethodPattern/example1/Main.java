package com.lowleveldesign.pattern.creational.factory.factoryMethodPattern.example1;

import com.lowleveldesign.pattern.creational.factory.factoryMethodPattern.example1.service.Shape;
import com.lowleveldesign.pattern.creational.factory.factoryMethodPattern.example1.util.ShapeFactoryMethod;
import com.lowleveldesign.pattern.creational.factory.factoryMethodPattern.example1.util.ShapeType;

public class Main {

    public static void main(String args[]){

        Shape circle= ShapeFactoryMethod.createShape(ShapeType.CIRCLE, 4.45);

        double area=circle.findArea();
        System.out.println("Area of circle is: "+area);

        Shape square= ShapeFactoryMethod.createShape(ShapeType.SQUARE, 3.50);
        double perimeter=square.findPerimeter();
        System.out.println("Perimeter of square is: "+perimeter);

        Shape rectangle= ShapeFactoryMethod.createShape(ShapeType.RECTANGLE, 4.0, 5.0);
        double areaOfRectangle=rectangle.findArea();
        System.out.println("Area of rectangle is: "+areaOfRectangle);
    }


    /*
    There are Shape objects which can be of type Circle, Square and Rectangle. We want to create these objects without
    exposing the creation logic to the client and refer to newly created object using a common interface.
     */
}
