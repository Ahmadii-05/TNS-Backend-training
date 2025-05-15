package com.tnsif.generics;

public class Sender<T>{
	
	//T-->the datatype
	private T message;
	
	public void setMessage(T message) {
		this.message=message;
		}
	
	public T getMessage() {
		return message;
	}

}
