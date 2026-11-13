package com.learn.solid.ocp.productCartWithDiffDb;

public class MongoStorage implements DbStorage{

    private ShopingCart sc;

    public MongoStorage(ShopingCart sc){
        this.sc=sc;
    }

    @Override
    public void dbStorage() {
        System.out.println("Stored to MongoDb ....");
    }
}
