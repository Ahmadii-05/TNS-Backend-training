package com.tnsif.collectiondemo;
//allow duplications & preserve insertion order
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	 public static void main(String[] args) {
	        List<Integer> l = new LinkedList<Integer>();
	        l.add(10);
	        l.add(10);
	        l.add(34);
	        l.add(23);

	        for (int i : l) {
	            System.out.println(i);
	        }

	        l.remove(1); // Removes the element at index 1 (second 10)
	        System.out.println("After deletion");

	        for (int i : l) {
	            System.out.println(i);
	        }
	    }
	}


