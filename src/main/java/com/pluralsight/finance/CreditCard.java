package com.pluralsight.finance;

public class CreditCard implements Valuable {

    // storing credit card information
    private String cardNumber;
    private double balance;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }
    // add purchase to the amount due
    public void charge(double amount) {
        balance -= amount;
    }
    // return the card value as negative debt
    @Override
    public double getValue() {
        return -balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
