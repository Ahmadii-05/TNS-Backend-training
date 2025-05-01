package com.tnsif.oopsconsept;

public class Constructor {
	private String name;
	private int age;
	
	//constructor
	public Constructor(String name,int age) {
		this.name=name;
		this.age=age;
	}
    public void display() {
    	System.out.println(name);
    	System.out.println(age);	
    }
    public static void main(String args[]) {
    	Constructor c = new Constructor("abhi",22);
    	c.display();
    }
}
