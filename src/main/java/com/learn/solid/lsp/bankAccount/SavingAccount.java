package com.learn.solid.lsp.bankAccount;

public class SavingAccount implements WithdrawableAccount {
    private double balance;

    public SavingAccount(double balance){
        if(balance<1000){
            throw new IllegalArgumentException("Minimum 1000 Rs need to deposit to open saving account");
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
            throw new IllegalArgumentException("Insufficient fund in saving account");
        }
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
