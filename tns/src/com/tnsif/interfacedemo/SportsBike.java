package com.tnsif.interfacedemo;

public class SportsBike extends Bike {
	 String brand;

	    // Constructor using 'this'
	    SportsBike(String brand) {
	        this.brand = brand;  // refers to the current object's brand
	    }

	    // Overriding the start method
	    void start() {
	        super.start();  // calls start() from Bike class
	        System.out.println(this.brand + " sports bike is roaring!");
	        System.out.println("Max speed (final): " + super.maxSpeed + " km/h");
	    }
	}


