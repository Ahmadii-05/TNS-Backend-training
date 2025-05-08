package com.tnsif.exceptiondemo;

public class BankMain {
	public static void main(String[] args) {
        BankAccount account = new BankAccount(123456, 5000.0);

        try {
            account.deposit(1000);
            account.withdraw(2000);
            account.withdraw(5000); // Will throw InsufficientFundsException
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            account.displayBalance();
        }
    }
}


