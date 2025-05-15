package com.tnsif.lambdademo;

import java.util.Arrays;
import java.util.List;
//demo for predefined functional interface
//Comparable -->compareTo
public class LambdaCollection {
	public static void main(String[] args) {
		List<String> l= Arrays.asList("Allen","bobby","Aaru","Alex");
		
		
	//sorting using lambda
	//a -> first value in the arrayList
	//b -> second value in the arrayList
	l.sort((a,b)->a.compareTo(b));
	
	//for (string s:l)
	l.forEach(names->System.out.println(names));
	}

}
