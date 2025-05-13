package com.tnsif.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {
	public static void main(String[] args) {
		List<Employee> l= new ArrayList<Employee>();
		l.add(new Employee(101,"kavya","CSE",8.9f,21));
		l.add(new Employee(102,"keerthi","CSM",7.9f,22));
		l.add(new Employee(103,"ravi","IT",8.2f,18));
		l.add(new Employee(104,"yash","DS",9.0f,19));
		l.add(new Employee(105,"bobby","IOT",6.5f,21));
		
		
		Collections.sort(l);
		for(Employee i:l) {
			System.out.println(i);
		}

	}
}
