package com.learn.solid.lsp.bankAccount;

public class CurrentAccount implements WithdrawableAccount {
    private double balance;

    public CurrentAccount(double balance){
        if(balance<50000){
            throw new IllegalArgumentException("Minimum 50000 Rs need to deposit to open current account");
        }
        this.balance=balance;
    }
    @Override
    public void withdraw(double amount) {
        if(amount<0){
            throw new IllegalArgumentException("Amount could not be negative");
        }

        if(amount<=balance){
            balance-=amount;
        }else{
            throw new IllegalArgumentException("Insufficient fund in current account");
        }
    }

    @Override
    public void deposit(double amount) {
        if(amount<0){
            throw new IllegalArgumentException("Amount could not be negative");
        }
        balance+=amount;
    }

    public double getBalance(){
        return  balance;
    }
}
