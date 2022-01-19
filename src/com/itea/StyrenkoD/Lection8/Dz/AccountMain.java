package com.itea.StyrenkoD.Lection8.Dz;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account("2600334455");
        account.addTransaction(1,10011.22,0);
        account.addTransaction(1,514.56,1);
        account.addTransaction(1,100.00,2);
        account.addTransaction(4,1000.00,2);
        account.addTransaction(4,100.00,2);
        account.TransactionsForPeriod(1,10);
    }
}
