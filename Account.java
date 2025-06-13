package com.mycompany.accountapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Oli
 */
public class Account {
  
    private double balance;
    private String pin;
    private String userid;
    private String phone;
    private String touchlock;
    private String username;
    private String accountno;

    public Account(String userid, String username, String phone, String touchlock, String accountno) {
        this.userid = userid;
        this.username = username;
        this.phone = phone;
        this.touchlock = touchlock;
        this.accountno = accountno;
        this.balance = 500.00;
    }

    public boolean setPin(String pin) {
        if (pin.matches("\\d{4}")) {
            this.pin = pin;
            return true;
        }
        return false;
    }

    public boolean login(String inputPin) {
        return pin != null && pin.equals(inputPin);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void showBalance() {
        System.out.printf("Current Balance: %.2f\n", balance);
    }

    public void showInfo() {
        System.out.println("Welcome to bKash App");
        System.out.println("Name: " + username);
        System.out.println("User ID: " + userid);
        System.out.println("Phone: " + phone);
        System.out.println("Account No: " + accountno);
        System.out.println("Touch Lock: " + touchlock);
        showBalance();
    }
}

    

