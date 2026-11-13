package com.learn.solid.srp.productCart;

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

        DbStorage dbStorage=new DbStorage(shopingCart);
        dbStorage.dbStorage();

        shopingCart.removeProduct(product2);
        InvoicePrinter invoicePrinter2=new InvoicePrinter(shopingCart);
        invoicePrinter2.printInvoice();

    }
}
