package com.bankinc;
 // import java.util.Random;
import java.util.Scanner;
public class Main {

    static Scanner scanner = new Scanner(System.in);
    static int correctPin = 6767;
    public static void main(String[] args) {

        System.out.println("Welcome to Java ATM!");

        System.out.print("Enter your PIN: ");
int pin = scanner.nextInt();

        if (pin == correctPin) {
            showMenu();
        } else {
            System.out.println("Incorrect PIN. Access denied.");
        }
}

// Display ATM menu
public static void showMenu() {

    System.out.println("\n=== ATM MENU ===");
    System.out.println("1. Withdraw");
    System.out.println("2. Deposit");
    System.out.print("Choose an option: ");


    int choice = scanner.nextInt();

    switch (choice) {
        case 1:
            System.out.println("Withdraw selected.");
            break;
        case 2:
            deposit();
            break;
        default:
            System.out.println("Invalid option.");
    }
}

// Deposit money
public static void deposit() {

    System.out.println("\nChoose your account:");
    System.out.println("1. Savings");
    System.out.println("2. Checking");

    int account = scanner.nextInt();

    if (account != 1 && account != 2) {
        System.out.println("Invalid account.");
        return;
    }

    System.out.print("How much do you want to deposit? $");
    int expectedAmount = scanner.nextInt();

    System.out.println("\nInsert your bills...");
    System.out.println("ATM is counting your money...");

    // Simulate the bills inserted into the ATM
    int[] bills = {100, 100, 100, 100, 100,
            100, 100, 100, 100, 100, 20};

    int total = 0;

    for (int bill : bills) {
        System.out.println("Reading bill: $" + bill);
        total += bill;
    }

    System.out.println("\nTotal counted: $" + total);

    System.out.print("Is this the correct amount? (yes/no): ");
    String answer = scanner.next();

    if (answer.equalsIgnoreCase("yes")) {
        System.out.println("Deposit successful!");
        System.out.println("Deposited: $" + total);
    } else {
        System.out.print("What is the correct amount? $");
        int correctAmount = scanner.nextInt();

        System.out.println("You entered: $" + correctAmount);
        System.out.println("Returning all bills...");
        System.out.println("Please take your money.");
        System.out.println("Deposit cancelled.");
    }
}
}
//camelCasing = Variables

