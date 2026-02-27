package com.lowleveldesign.pattern.creational.factory.factoryMethodPattern.example1.service;

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double findArea() {
        return side * side;
    }

    @Override
    public double findPerimeter() {
        return 4 * side;
    }
}
