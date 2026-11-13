package com.learn.pattern.strategy.withoutStrategy;

public class CarRoute extends GoogleMaps{

    @Override
    public void calculateRoute() {
        System.out.println("Car route calculating...");
    }
}
