package com.tnsif.multithreading;

public class RunMain {

	public static void main(String[] args) {
		ThreadRun t1= new ThreadRun("task1");
		ThreadRun t2= new ThreadRun("task2");
		
		Thread ob = new Thread(t1);
		Thread ob1= new Thread(t2);
		
		ob.start();
		ob1.start();
			
	}

}
