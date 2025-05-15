package com.tnsif.generics;

public class GenericMethodMain {
	public static void main(String[] args) {
		Integer[] intarray= {1,2,3};
		String[] stringarray= {"Allen","dolly","candy"};
		
		//call the method
		GenericMethodDemo.displayArray(intarray);
		
		GenericMethodDemo.displayArray(stringarray);		
	}


}
