package com.pluralsight;
import com.pluralsight.finance.*;


public class FinanceApplication {
    public static void main(String[] args) {

        // creating a new portfolio
        Portfolio portfolio = new Portfolio("My Portfolio", "Myrka");

        // create a house
        House house = new House("My House", 250000, 2020, 2000, 3);

        // create Jewelry
        Jewelry jewelry = new Jewelry("Gold Ring", 1500,18);

        // create bank account
        BankAccount bankAccount = new BankAccount("12345");
        bankAccount.deposit(1000);

        // create a credit card
        CreditCard creditCard = new CreditCard("97845");
        creditCard.charge(500);

        // add all valuables to the portfolio
        portfolio.add(house);
        portfolio.add(jewelry);
        portfolio.add(bankAccount);
        portfolio.add(creditCard);

        // Display the total net value
        System.out.println("Portfolio Value: $" + portfolio.getValue());

        // display the most valuable asset
        System.out.println("Most Valuable: " + portfolio.getMostValuable().getClass().getSimpleName());

        // display the least valuable asset
        System.out.println("Least Valuable: " + portfolio.getLeastValuable().getClass().getSimpleName());
    }
}
