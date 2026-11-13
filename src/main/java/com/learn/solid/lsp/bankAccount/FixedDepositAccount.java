package com.learn.solid.lsp.bankAccount;

public class FixedDepositAccount implements DepositOnlyAccount{
    private double balance;

    public FixedDepositAccount(double balance){
        if(balance<5000){
            throw new IllegalArgumentException("Minimum 5000 Rs need to deposit to open FD account");
        }
        this.balance=balance;
    }

    @Override
    public void deposit(double amount) {
        if(amount<0){
            throw new IllegalArgumentException("Amount could not be negative");
        }
        balance+=amount;
    }

    @Override
    public double getBalance(){
        return balance;
    }
}
