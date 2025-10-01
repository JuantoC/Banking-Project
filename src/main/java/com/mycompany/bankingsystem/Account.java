package com.mycompany.bankingsystem;

import java.util.concurrent.ThreadLocalRandom;

public class Account {

    private double balance;
    private final int accountId;
    private final int ownerDocument;

    // Constructor
    public Account(double balance, int ownerDocument) {
        this.accountId = ThreadLocalRandom.current().nextInt(100000, 999999);
        this.balance = balance;
        this.ownerDocument = ownerDocument;
    }

    // Getters
    public double getBalance() {
        return this.balance;
    }

    public int getAccountId() {
        return this.accountId;
    }

    public int getOwnerDocument() {
        return this.ownerDocument;
    }

    // Operations
    public boolean checkBalance(double amount) {
        return balance >= amount;
    }

    public void depositBalance(double amount) {
        balance += amount;
    }

    public void withdrawBalance(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Transferencia exitosa");
        }
        System.out.println("Transferencia fallida");
    }

    @Override
    public String toString() {
        return "Cuenta #" + accountId + " | Doc: " + ownerDocument + " | Saldo: " + balance;
    }
}
