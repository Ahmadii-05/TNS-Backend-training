package com.tnsif.collectiondemo;
//allow duplicates & preserves insertion order
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String args[]) {
		int a =10;
		//wrapper class
		//int-->Integer
		//float-->Float  double-->Double
		List<Integer> ll=new ArrayList<Integer>();
		ll.add(10);
		ll.add(10);
		ll.add(34);
		ll.add(23);
		//ll.add("sri");
		//ll.add(3.4f);
		
		for(int i:ll) {
			System.out.println("The elements in list interface"+i);
		}
	}

}
