package com.tnsif.collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
	public static void main(String[] args) {
		List<Student> l= new ArrayList<Student>();
		l.add(new Student(101,"kavya","CSE",8.9f));
		l.add(new Student(102,"keerthi","CSM",7.9f));
		l.add(new Student(103,"ravi","IT",8.2f));
		l.add(new Student(104,"yash","DS",9.0f));
		l.add(new Student(105,"bobby","IOT",6.5f));
		
		for(Student i:l) {
			System.out.println(i);
		}
		
		//for method retrieving
		//Student ob=new Student();
		//ob.print(101, kavya, CSE,8.0);
		//ob.print(102, keerthi, CSM,8.9);
	}

}
