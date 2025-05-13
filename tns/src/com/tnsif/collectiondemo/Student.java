package com.tnsif.collectiondemo;
//using constructor to store data
//and retrieve using iterator in collections
public class Student {
	private int sid;
	private String sname;
	private String branch;
	private float cgpa;
	
	//constructor
	public Student(int sid, String sname, String branch, float cgpa) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.branch = branch;
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", branch=" + branch + ", cgpa=" + cgpa + "]";
	}
	
	//using method 
	//void print(int sid, String name,String branch,float cgpa) {
	//	System.out.println("The details of the student"+sid+","+name+","+branch+","+cgpa);
	//}
	

}
