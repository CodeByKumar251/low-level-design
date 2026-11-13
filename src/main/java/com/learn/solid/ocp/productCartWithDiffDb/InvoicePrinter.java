package com.learn.solid.ocp.productCartWithDiffDb;

import java.util.List;

public class InvoicePrinter {

    private ShopingCart sc;

    public InvoicePrinter(ShopingCart sc){
        this.sc=sc;
    }

    public void printInvoice(){
        List<Product> products=sc.getProducts();
        System.out.println("Shoping cart invoice");
        for(Product product:products){
            System.out.println(product.getName()+" of price: "+product.getPrice());
        }
        System.out.println("Total price: "+sc.calculatePrice());
    }
}
