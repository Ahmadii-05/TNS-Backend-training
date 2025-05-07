package com.tnsif.interfacedemo;

public class BookMain {
	 public static void main(String[] args) {
		 Book ob=new Book("Lighthouse");
		 Book o = new Book(ob);
		 ob.display();
		 o.display();
	 }

}
