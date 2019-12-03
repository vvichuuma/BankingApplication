package com.codeWithMosh;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public  Customer(String name, double amount){
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransactions(amount);
    }

    //addTransactions:
    public void addTransactions(double amount){
        this.transactions.add(amount);
    }

    //returns the String name:
    public String getName(String name){
        return this.name ;
    }

    //returns the array list of transactions:
    public ArrayList<Double> getTransactions(){
        return this.transactions;
    }

    public void testCode(){
        System.out.println("Hey name is " + this.name + " and transactions " + this.transactions);
    }

}
