package com.pluralsight.finance;

public class CreditCard implements Valuable {

    private String name;
    private String accNum;
    private double balance;

    public CreditCard(String name, String accNum, double balance) {
        this.name = name;
        this.accNum = accNum;
        this.balance = balance;
    }

    public void charge(double amount) {
        balance += amount;
    }

    public void pay(double amount) {
        balance -= amount;
    }

    @Override
    public double getValue() {
        return -balance;
    }
}