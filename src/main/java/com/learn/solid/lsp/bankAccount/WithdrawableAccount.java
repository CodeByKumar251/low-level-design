package com.learn.solid.lsp.bankAccount;

public interface WithdrawableAccount extends DepositOnlyAccount {

    void withdraw(double amount);
}
