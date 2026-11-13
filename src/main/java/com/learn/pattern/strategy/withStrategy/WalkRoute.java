package com.learn.pattern.strategy.withStrategy;

public class WalkRoute implements RouteStrategy{

    @Override
    public void calculateRoute() {
        System.out.println("Walk route calculating...");
    }
}
