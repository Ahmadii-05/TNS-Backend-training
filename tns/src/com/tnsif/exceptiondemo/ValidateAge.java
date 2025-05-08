package com.tnsif.exceptiondemo;

public class ValidateAge {
	public static void validAge(int age) throws MyException{
		if (age<0) {
			throw new MyException("Age is not valid");
		}
		else {
			System.out.println("age is valid");
			}
	}

	

}
