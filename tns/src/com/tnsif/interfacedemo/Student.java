package com.tnsif.interfacedemo;
//take user input
import java.util.Scanner;
public class Student {
    String username1;
    int id;
    int number;

    // Constructor to input data
    public Student() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the username: ");
        username1 = sc.nextLine();

        System.out.print("Enter the ID: ");
        id = sc.nextInt();

        System.out.print("Enter the number: ");
        number = sc.nextInt();
    }

    void display() {
        System.out.println("Username: " + username1);
        System.out.println("ID: " + id);
        System.out.println("Number: " + number);
    }
	
}
