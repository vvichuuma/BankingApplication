package com.codeWithMosh;

public class Main {

    public static void main(String[] args) {

        //Bank Class:

      Bank bank = new Bank("Bank of Baroda");
      bank.addBranch("Mount prospect");
      bank.addBranch("Arlington heights");
      bank.addNewCustomer("Mount prospect", "Vish", 23.12);
      bank.addNewCustomer("Des plaines" , "Hendry", 12.98);
        bank.addNewCustomer("Mount prospect", "Vish", 53.12);
      bank.testCode();

    }
}
