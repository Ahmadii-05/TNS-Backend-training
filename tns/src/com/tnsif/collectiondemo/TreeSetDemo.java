package com.tnsif.collectiondemo;


import java.util.Set;
import java.util.TreeSet;
//no duplicates & natural sorting order
public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(10);
		ts.add(34);
		ts.add(23);
		
		
		for(int i:ts) {
			System.out.println(i);
		}

	}

}
