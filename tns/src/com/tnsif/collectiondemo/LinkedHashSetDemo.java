package com.tnsif.collectiondemo;

import java.util.LinkedHashSet;
import java.util.Set;
//no duplications & preserves insertion order
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<Integer>l=new LinkedHashSet<Integer>();
		l.add(10);
		l.add(10);
		l.add(34);
		l.add(23);
		
		
		for(int i:l) {
			System.out.println(i);
		}
		

	}

}
