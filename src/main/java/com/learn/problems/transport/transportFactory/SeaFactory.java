package com.learn.problems.transport.transportFactory;

import com.learn.problems.transport.transportLogic.Ship;
import com.learn.problems.transport.transportLogic.Transport;

public class SeaFactory implements TransportFactory{

    @Override
    public Transport createFactory(String type) {
        if("Ship".equalsIgnoreCase(type)){
            return new Ship();
        }else{
            throw new IllegalArgumentException("Not available");
        }
    }
}
