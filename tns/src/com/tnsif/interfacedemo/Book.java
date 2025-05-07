package com.tnsif.interfacedemo;
//copy constructor
public class Book {
	String title;
	Book(String title){
		this.title=title;
	}
	Book(Book b){
		this.title=b.title;
	}
	void display() {
		System.out.println(" title of book "  +  title);
	}

}
