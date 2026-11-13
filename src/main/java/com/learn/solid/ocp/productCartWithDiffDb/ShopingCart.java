package com.learn.solid.ocp.productCartWithDiffDb;

import java.util.ArrayList;
import java.util.List;

public class ShopingCart {

    private List<Product> products;

    public ShopingCart(){
        this.products=new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public Double calculatePrice(){
        double totalAmount=0.0d;
        for(Product product:products){
            totalAmount+=product.getPrice();
        }
        return totalAmount;
    }

    public List<Product> getProducts(){
        return products;
    }
}
