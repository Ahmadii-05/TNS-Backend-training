package com.tnsif.interfacedemo;

public class FunctionalMain {
	 public static void main(String[] args) {
	  
      FunctionalInter greeting = () -> System.out.println("Hello from a functional interface!");
      
      greeting.greet();  // Output: Hello from a functional interface!
  
  }
}

