package com.tnsif.generics;
//demo for applying generic on a method 
public class GenericMethodDemo {
	//List<Integer> l=new ArrayList<>();
		public static<T> void displayArray(T[] array) {
			//for(returntype varname:arrayname)
			for(T i:array) {
				System.out.println("Array elements"+i);
			}
		}

}
