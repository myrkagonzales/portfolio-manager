package com.pluralsight.finance;

public class BankAccount implements Valuable {

    // storing bank account information
    private String accountNumber;
    private double balance;

    // initializes the account with a starting balance
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance = 0.0;
    }

    // adding money to bank account
    public void deposit(double amount) {
        balance += amount;
    }
    // removing money from bank account
    public void withdraw(double amount) {
        balance -= amount;
    }
    // we return to current account balance
    @Override
    public double getValue() {
        return balance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
