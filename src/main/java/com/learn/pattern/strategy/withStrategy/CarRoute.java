package com.learn.pattern.strategy.withStrategy;

public class CarRoute implements RouteStrategy{

    @Override
    public void calculateRoute() {
        System.out.println("Car route calculating....");
    }

}
