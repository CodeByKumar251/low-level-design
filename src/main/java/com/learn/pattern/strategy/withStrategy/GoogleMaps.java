package com.learn.pattern.strategy.withStrategy;

/*
This is context class
used to manage strategy
and has ther
 */
public class GoogleMaps {

    private RouteStrategy routeStrategy;

    public GoogleMaps(RouteStrategy routeStrategy){
        this.routeStrategy=routeStrategy;
    }

    public void navigate(){
        validateLocation();
        routeStrategy.calculateRoute();
        showRoute();
        startGps();
    }

    public void changeStrategy(RouteStrategy routeStrategy){
        this.routeStrategy=routeStrategy;
    }

    private void validateLocation(){
        System.out.println("validating location....");
    }

    private void showRoute(){
        System.out.println("showing route....");
    }

    private void startGps(){
        System.out.println("starting gps .....");
    }
}
