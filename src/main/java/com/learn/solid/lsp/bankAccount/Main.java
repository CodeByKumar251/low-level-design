package com.learn.solid.lsp.bankAccount;

public class Main {
    public static void main(String[] args) {
        BankClientWithdrawable account=new BankClientWithdrawable(new SavingAccount(1000));
        account.deposit(2000);
        account.withdraw(750);

        BankClinetDeposit account2=new BankClinetDeposit(new FixedDepositAccount(10000));
        account2.deposit(1000);
    }
}
