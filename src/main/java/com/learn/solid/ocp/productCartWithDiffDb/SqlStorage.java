package com.learn.solid.ocp.productCartWithDiffDb;

public class SqlStorage implements DbStorage{

    private ShopingCart sc;

    public SqlStorage(ShopingCart sc){
        this.sc=sc;
    }

    @Override
    public void dbStorage() {
        System.out.println("Stored to SqlDb ....");
    }
}
