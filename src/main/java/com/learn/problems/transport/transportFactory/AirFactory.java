package com.learn.problems.transport.transportFactory;

import com.learn.problems.transport.transportLogic.Plane;
import com.learn.problems.transport.transportLogic.Transport;

public class AirFactory implements TransportFactory{

    @Override
    public Transport createFactory(String type) {
        if("Plane".equalsIgnoreCase(type)){
            return new Plane();
        }else{
            throw new IllegalArgumentException("Not available");
        }
    }
}
