/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.accountapp;

/**
 *
 * @author Oli
 */
import java.util.Scanner;

public class AccountApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to bKash App\n");

        System.out.print("Enter your name: ");
        String username = input.nextLine();

        System.out.print("Enter your User ID: ");
        String userid = input.nextLine();

        System.out.print("Enter your Phone Number: ");
        String phone = input.nextLine();

        System.out.print("Enter a Touch Lock Pattern: ");
        String touchlock = input.nextLine();

        System.out.print("Enter your Account Number: ");
        String accountno = input.nextLine();

        Account account = new Account(userid, username, phone, touchlock, accountno);

        // Set PIN
        System.out.print("Set a 4-digit PIN: ");
        String pin = input.nextLine();
        if (account.setPin(pin)) {
            System.out.println("PIN set successfully.");
        } else {
            System.out.println("Invalid PIN format. Must be 4 digits.");
            input.close();
            return;
        }

        // Login
        System.out.print("\nEnter PIN to login: ");
        String loginPin = input.nextLine();

        if (account.login(loginPin)) {
            int choice = 0;
            while (choice != 5) {
                System.out.println("\nMenu:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Show Balance");
                System.out.println("4. Show Info");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                choice = input.nextInt();

                if (choice == 1) {
                    System.out.print("Enter amount to deposit: ");
                    double dep = input.nextDouble();
                    account.deposit(dep);
                } else if (choice == 2) {
                    System.out.print("Enter amount to withdraw: ");
                    double wit = input.nextDouble();
                    account.withdraw(wit);
                } else if (choice == 3) {
                    account.showBalance();
                } else if (choice == 4) {
                    account.showInfo();
                } else if (choice == 5) {
                    System.out.println("Thank you for using bKash App.");
                } else {
                    System.out.println("Invalid option. Try again.");
                }
            }
        } else {
            System.out.println("Wrong PIN. Access denied.");
        }

        input.close();
    }
}
