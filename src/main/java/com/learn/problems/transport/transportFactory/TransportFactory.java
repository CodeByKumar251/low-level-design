package com.learn.problems.transport.transportFactory;

import com.learn.problems.transport.transportLogic.Transport;

public interface TransportFactory {

    public Transport createFactory(String type);
}
