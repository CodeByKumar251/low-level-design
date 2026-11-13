package com.learn.pattern.strategy.withoutStrategy;

public class Client {

    public static void main(String[] args) {

        GoogleMaps maps=new BikeRoute();
        maps.navigate();

        maps=new CarRoute();  //whole object changes
        maps.navigate();
    }
}
