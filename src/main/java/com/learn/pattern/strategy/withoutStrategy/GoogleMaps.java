package com.learn.pattern.strategy.withoutStrategy;

public abstract class GoogleMaps {

    public void navigate(){
        validateLocation();
        calculateRoute();
        showRoute();
        startGps();
    }

    public abstract void calculateRoute();

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
