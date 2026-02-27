package com.lowleveldesign.pattern.creational.factory.factoryMethodPattern.example1.service;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double findPerimeter() {
        return 2 * Math.PI * radius;
    }


}
