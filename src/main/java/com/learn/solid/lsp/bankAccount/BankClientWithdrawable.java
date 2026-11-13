package com.learn.solid.lsp.bankAccount;

public class BankClientWithdrawable {

    WithdrawableAccount account;

    public BankClientWithdrawable(WithdrawableAccount account){
        this.account=account;
    }

    public void deposit(double amount){
        try{
            account.deposit(amount);
            System.out.println("Your account has balance: "+account.getBalance());
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void withdraw(double amount){
        try{
            account.withdraw(amount);
            System.out.println("Your account has balance: "+account.getBalance());
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public double getBalance(){
        return account.getBalance();
    }
}
