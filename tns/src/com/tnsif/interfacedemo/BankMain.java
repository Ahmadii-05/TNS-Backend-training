package com.tnsif.interfacedemo;

public class BankMain {
	public static void main(String[] args) {
        Bank myAccount = new BankImple();
        myAccount.deposit(1000);
        myAccount.withdraw(500);
        System.out.println("Current Balance: ₹" + ((BankImple) myAccount).getBalance());
    }

}
