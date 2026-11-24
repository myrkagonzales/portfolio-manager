package com.pluralsight;
import com.pluralsight.finance.*;

import java.util.Arrays;
import java.util.Scanner;


public class FinanceApplication {
    public static void main(String[] args) {

        // scanner to read input
        Scanner financeScanner = new Scanner(System.in);


        // creating a new portfolio
        Portfolio portfolio = new Portfolio("My Portfolio", "Myrka");

        boolean addingAssets = true;

        // ask user to add assets until they decide to stop
        while (addingAssets) {
            System.out.println("\nWhat assets would you like to add?");
            System.out.println("1) House");
            System.out.println("2) Jewelry");
            System.out.println("3) Gold");
            System.out.println("4) Bank Account");
            System.out.println("5) Credit Card");
            System.out.println("0) Finish adding resources");
            System.out.print("Enter your choice: ");

            int choice = financeScanner.nextInt();
            financeScanner.nextLine(); // clear the newline


            switch (choice) {
                case 1:
                    // collect house info
                    System.out.print("Enter house name: ");
                    String houseName = financeScanner.nextLine();

                    System.out.print("Enter market value: ");
                    double houseValue = financeScanner.nextDouble();

                    System.out.print("Enter year built: ");
                    int yearBuilt = financeScanner.nextInt();

                    System.out.print("Enter square footage: ");
                    int squareFeet = financeScanner.nextInt();

                    System.out.print("Enter number of bedrooms: ");
                    int bedrooms = financeScanner.nextInt();
                    financeScanner.nextLine();

                    // create the house and add to portfolio
                    portfolio.add(new House( houseName, houseValue, yearBuilt, squareFeet, bedrooms));
                    break;

                case 2:
                    // collect jewelry's info
                    System.out.print("Enter jewelry name: ");
                    String jewelryName = financeScanner.nextLine();

                    System.out.print("Enter market value: ");
                    double jewelryValue = financeScanner.nextDouble();

                    System.out.print("Enter karat: ");
                    double karat = financeScanner.nextDouble();
                    financeScanner.nextLine();

                    portfolio.add(new Jewelry(jewelryName, jewelryValue, karat));
                    break;

                case 3:
                    // collect gold info
                    System.out.print("Enter gold name: ");
                    String goldName = financeScanner.nextLine();

                    System.out.print("Enter market value: ");
                    double goldValue = financeScanner.nextDouble();

                    System.out.print("Enter weight: ");
                    double weight = financeScanner.nextDouble();
                    financeScanner.nextLine();

                    portfolio.add(new Gold(goldName, goldValue, weight));
                    break;

                case 4:
                    // collect bank account info
                    System.out.print("Enter account number: ");
                    String accountNumber = financeScanner.nextLine();

                    System.out.print("Enter initial deposit: ");
                    double deposit = financeScanner.nextDouble();
                    financeScanner.nextLine();

                    BankAccount bankAccount = new BankAccount(accountNumber);
                    bankAccount.deposit(deposit);

                    portfolio.add(bankAccount);
                    break;

                case 5:
                    // collect CC info
                    System.out.print("Enter card number: ");
                    String cardNumber = financeScanner.nextLine();

                    System.out.print("Enter current balance: ");
                    double balance = financeScanner.nextDouble();
                    financeScanner.nextLine();

                    CreditCard creditCard = new CreditCard(cardNumber);
                    creditCard.charge(balance);

                    portfolio.add(creditCard);
                    break;

                case 0:
                    // stop collecting info
                    addingAssets = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        // display portfolio results
        System.out.println("\n--- Portfolio Summary ---");
        System.out.println("Total Portfolio Value: $" + portfolio.getValue());

        if (portfolio.getMostValuable() != null) {
            System.out.println("Most Valuable Asset: " + portfolio.getMostValuable().getClass().getSimpleName());
        }
        if (portfolio.getLeastValuable() != null) {
            System.out.println("Least Valuable Asset:" + portfolio.getLeastValuable().getClass().getSimpleName());
        }
        // close financeScanner
        financeScanner.close();

    }
}
