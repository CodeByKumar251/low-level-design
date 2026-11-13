package com.learn.problems.transport.transportFactory;

import com.learn.problems.transport.transportLogic.Train;
import com.learn.problems.transport.transportLogic.Transport;
import com.learn.problems.transport.transportLogic.Truck;

public class RoadFactory implements TransportFactory{

    @Override
    public Transport createFactory(String type) {
        if("Truck".equalsIgnoreCase(type)){
            return new Truck();
        }else if("train".equalsIgnoreCase(type)){
            return new Train();

        }else{
            throw new IllegalArgumentException("Not available");
        }
    }
}
