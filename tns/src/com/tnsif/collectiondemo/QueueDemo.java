package com.tnsif.collectiondemo;

import java.util.PriorityQueue;

//demo for queue
public class QueueDemo {
	public static void main(String[] args){
		PriorityQueue<String> dq= new PriorityQueue<String>();
		dq.add("Ahmadi");
		dq.add("zoya");
		dq.add("Tabu");
		dq.add("sam");
		//follow natural sorting order
		for(String names:dq) {
			System.out.println(names);
		}
		
		//for integers
		PriorityQueue<Integer> d= new PriorityQueue<Integer>();
		d.add(364);
		d.add(271);
		d.add(1);
		d.add(122);
		
		for(Integer num:d) {
			System.out.println(num);
		}
	}

}
