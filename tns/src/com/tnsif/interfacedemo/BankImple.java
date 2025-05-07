package com.tnsif.interfacedemo;

public class BankImple implements Bank {
	private double balance=20000;

	    public void deposit(double amount) {
	    	if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: ₹" + amount);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }
	       

	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: ₹" + amount);
	        } else {
	            System.err.println("Insufficient balance!");
	        }
	    }
	    public double getBalance() {
	        return balance;
	    }

	   
	}



