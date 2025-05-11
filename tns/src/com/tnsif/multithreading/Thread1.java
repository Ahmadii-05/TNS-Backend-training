package com.tnsif.multithreading;

public class Thread1 extends Thread{
	ThreadComm tc;
	public Thread1(ThreadComm tc) {
		super();
		this.tc=tc;
	}
	public void run() {
		for(int j=1;j<5;j++) {
			tc.deliver(j);
		}
	}

}
