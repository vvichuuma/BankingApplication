package com.codeWithMosh;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customerList;

    public Branch(String name){
        this.name = name;
        this.customerList = new ArrayList<Customer>();
    }

    //return the Branch Name:
    public String getName(){
        return this.name;
    }

    //returns an arrayList of customers:
    public ArrayList<Customer> getCustomerList(){
        return this.customerList;
    }

    //If it is an existing Customer:
    public Customer findCustomer(String name){
         for(int i = 0; i < this.customerList.size(); i++){
             if(customerList.get(i).getName(name).equals(name)){
                 return customerList.get(i);
             }
         }

         return null;
    }

    //add a new Customer:
    public void addCustomer(String name, double amount){
        //if it is an existing customer add amount to that customer:
        Customer customer = findCustomer(name);
        if(customer != null){
            customer.addTransactions(amount);
        }else if(customer == null){
            this.customerList.add(new Customer(name, amount));
        }
    }


    public void testCode(){
        for(int j = 0; j < this.customerList.size(); j++){
            this.customerList.get(j).testCode();
        }
    }

}
