package com.learn.problems.transport;

import com.learn.problems.transport.transportFactory.RoadFactory;
import com.learn.problems.transport.transportFactory.TransportFactory;
import com.learn.problems.transport.transportLogic.Transport;

public class Main {
    public static void main(String[] args) {
        TransportFactory transportFactory=new RoadFactory();
        Transport transport=transportFactory.createFactory("plane");
        transport.delivery();
    }
}
