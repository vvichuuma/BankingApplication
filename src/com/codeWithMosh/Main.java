package com.codeWithMosh;

public class Main {

    public static void main(String[] args) {
	// write your code here

       Branch branch = new Branch("Anna Nagar");
       branch.addCustomer("David", 23.12);
       branch.addCustomer("Mosh", 12.56);
       branch.addCustomer("David", 10.1);
       branch.testCode();

    }
}
