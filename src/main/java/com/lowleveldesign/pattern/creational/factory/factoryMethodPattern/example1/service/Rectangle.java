package com.lowleveldesign.pattern.creational.factory.factoryMethodPattern.example1.service;

public class Rectangle implements Shape {

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double findArea() {
        return length * breadth;
    }

    @Override
    public double findPerimeter() {
        return 2 * (length + breadth);
    }
}
