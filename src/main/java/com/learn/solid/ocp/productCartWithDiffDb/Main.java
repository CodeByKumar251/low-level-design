package com.learn.solid.ocp.productCartWithDiffDb;

public class Main {

    public static void main(String[] args) {

        //client code

        ShopingCart shopingCart=new ShopingCart();

        Product product1=new Product("Trowser",500);
        Product product2=new Product("Shirt",300);
        shopingCart.addProduct(product1);
        shopingCart.addProduct(product2);

        InvoicePrinter invoicePrinter=new InvoicePrinter(shopingCart);
        invoicePrinter.printInvoice();

        DbStorage dbStorage=new SqlStorage(shopingCart);
        dbStorage.dbStorage();

        DbStorage dbStorage2=new MongoStorage(shopingCart);
        dbStorage2.dbStorage();



    }
}
