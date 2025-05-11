package com.tnsif.multithreading;
//demo for runnable interface
public class ThreadRun implements Runnable {
	String name;
	public ThreadRun(String name) {
		this.name= name;
	}
	
	@Override
	public void run() {
		for(int i=0;i <5;i++) {
			System.out.println("the current thread " + name);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
