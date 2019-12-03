package com.codeWithMosh;

public class Main {

    public static void main(String[] args) {

        // Welcome to the Banking Application:
        //Where an user can create an account in a bank.
        //Where an user can view his/her transactions.
        //Where an Admin can view the list of branches in the bank and the customer transactions.

      Bank bank = new Bank("Bank of Baroda");
      bank.addBranch("Mount prospect");
      bank.addBranch("Arlington heights");
      bank.addNewCustomer("Mount prospect", "Vish", 23.12);
      bank.addNewCustomer("Des plaines" , "Hendry", 12.98);
        bank.addNewCustomer("Mount prospect", "Vish", 53.12);
      bank.testCode();

    }
}
