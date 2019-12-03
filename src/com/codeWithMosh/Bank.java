package com.codeWithMosh;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branchList;

    public Bank(String name){
        this.name = name;
        this.branchList = new ArrayList<Branch>();
    }

    //Add a new Branch to the Bank:
    public void addBranch(String name){
        this.branchList.add(new Branch(name));
    }

    public String getName(){
        return this.name;
    }

    //find if it is an existing branch:
    public Branch findBranch(String branchName){
        for(int i = 0 ; i < branchList.size(); i++){
            if(branchList.get(i).getName().equals(branchName)){
                return branchList.get(i);
            }
        }

        return null;
    }


    //Add a new customer to the Bank:
    public void addNewCustomer(String branchName, String customerName, double amount){
        //if a branch already exists:
        if(findBranch(branchName) != null){
            Branch branch = findBranch(branchName);
            //if the customer is already present in that branch :
            Customer customer = branch.findCustomer(customerName);
            if(customer != null){
                customer.addTransactions(amount);
            }else if(customer == null){
                //if that customer is not present in that branch:
                branch.addCustomer(customerName,amount);
            }

        }else if(findBranch(branchName) == null){
            //if the branch does not exists:
            Branch branch = new Branch(branchName);
            branch.addCustomer(customerName,amount);
            this.branchList.add(branch);
        }
    }

    public void testCode(){

        System.out.println("--------------------------------");
        System.out.println("Bank name is : " + this.getName());
        System.out.println("--------------------------------");
        for(int j = 0; j < this.branchList.size(); j++){

            System.out.println("THe branch Name is : " + this.branchList.get(j).getName() );
            if(this.branchList.get(j).getCustomerList().size() == 0){
                System.out.println("This branch does not have customers");
            }else{
                this.branchList.get(j).testCode();

            }

            System.out.println("---------------------");

        }
    }

}
