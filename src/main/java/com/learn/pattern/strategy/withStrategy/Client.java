package com.learn.pattern.strategy.withStrategy;

public class Client {

    public static void main(String[] args) {

        GoogleMaps maps=new GoogleMaps(new CarRoute());
        maps.navigate();

        maps.changeStrategy(new BikeRoute());  // whole object has not changes, base object GoogleMaps as it is
        maps.navigate();
    }
}
