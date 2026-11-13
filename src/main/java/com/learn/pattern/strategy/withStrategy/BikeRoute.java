package com.learn.pattern.strategy.withStrategy;

public class BikeRoute implements RouteStrategy{

    @Override
    public void calculateRoute() {
        System.out.println("Bike route calculating");
    }
}
