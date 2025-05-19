package com.pluralsight;

public class BankAccount implements Valuable {
    private String name;
    private String accNum;
    private double balance;

    public BankAccount(String name, String accNum, double balance) {
        this.name = name;
        this.accNum = accNum;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public double getValue() {
        return balance;
    }
}
