package com.learn.solid.srp.productCart;

import java.util.List;

public class DbStorage {

    private ShopingCart sc;

    public DbStorage(ShopingCart sc){
        this.sc=sc;
    }

    public void dbStorage(){
        List<Product> products=sc.getProducts();
        System.out.println("Saving to db.....");

    }
}
