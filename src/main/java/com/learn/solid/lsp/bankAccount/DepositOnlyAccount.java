package com.learn.solid.lsp.bankAccount;

public interface DepositOnlyAccount {

    void deposit(double amount);
    double getBalance();
}
