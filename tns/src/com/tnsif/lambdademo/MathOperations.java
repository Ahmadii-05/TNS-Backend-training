package com.tnsif.lambdademo;
//Demo for lambda expression using user defined functional interface
@FunctionalInterface
interface MathCal{
	int Cal(int a , int b);
}
public class MathOperations {
	public static void main(String[] args) {
		//(parameters)->{statements}
		MathCal add = (a,b)->a+b;
		MathCal mul = (a,b)->a * b;
		
		System.out.println(add.Cal(10, 5));
		System.out.println(mul.Cal(3, 6));
	}

}
