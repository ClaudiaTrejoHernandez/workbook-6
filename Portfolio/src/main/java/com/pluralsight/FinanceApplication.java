package com.pluralsight;

import com.pluralsight.finance.*;

public class FinanceApplication {
    public static void main(String[] args) {

        Portfolio myPortfolio = new Portfolio("My Assets","Claudia");

        myPortfolio.add(new BankAccount("Chase Savings","123",5000));
        myPortfolio.add(new CreditCard("Chase Credit Card","223",520));
        myPortfolio.add(new Gold("My Gold",74000.0,515));
        myPortfolio.add(new House("My House",125000.0,2020,950,2));
        myPortfolio.add(new Jewelry("Necklace",1000.0,1));

        System.out.println("Total Portfolio Value: $" + myPortfolio.getValue());

        System.out.println(myPortfolio.getMostValuable());
    }
}
