package com.tnsif.collectiondemo;
//demo comparable
//custom sorting based on only one instance
//retrieve key value pair based on age factor
public class Employee implements Comparable<Employee>{
	
	public int sid;
	public String sname;
	public String branch;
	public float cgpa;
	public int age;
	public Employee(int sid, String sname, String branch, float cgpa, int age) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.branch = branch;
		this.cgpa = cgpa;
		this.age = age;
	}
	
	//greater -1, lesser - -1, equal - zero
	//18,20,21,23
	//age(18)==s.age(20)
	
	public int compareTo(Employee e) {
		if(age==e.age)
		return 0;
		else if(age >e.age)
			return 1;
		else
			return -1;
		
	}

	@Override
	public String toString() {
		return "Employee [sid=" + sid + ", sname=" + sname + ", branch=" + branch + ", cgpa=" + cgpa + ", age=" + age
				+ "]";
	}
}
