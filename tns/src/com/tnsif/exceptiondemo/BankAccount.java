package com.tnsif.exceptiondemo;

public class BankAccount {
	private int accountNumber;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero.");
        }
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    // Withdraw method
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        }
        balance -= amount;
        System.out.println("Withdrawn: ₹" + amount);
    }

    // Display balance
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + ", Balance: ₹" + balance);
    }
}
	

