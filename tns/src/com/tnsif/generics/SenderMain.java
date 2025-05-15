package com.tnsif.generics;

public class SenderMain {
    public static void main(String[] args) {
    	Sender<String> ob = new Sender<String>();
    	ob.setMessage("Hello");
    	System.out.println(ob.getMessage());
    	
    	Sender<Integer> o = new Sender<Integer>();
    	o.setMessage(123);
    	System.out.println(o.getMessage());
    }
}
