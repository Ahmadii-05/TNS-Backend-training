package com.tnsif.lambdademo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoStreamOperations {

	public static void main(String[] args) {
		List<Employee> l= new ArrayList<Employee>();
		
		l.add(new Employee(101,"Srilatha",34567.45f));
		l.add(new Employee(102,"Aaru",77567.85f));
		l.add(new Employee(103,"Sunitha",56867.82f));
		l.add(new Employee(104,"Supriya",89567.85f));
		l.add(new Employee(105,"kaira",78547.63f));
		l.add(new Employee(106,"Nitu",97367.21f));
		
		//filter data based on salary ->>72000
		Stream<Employee> st = l.stream().filter(sal -> sal.esal>72000.00f);
		st.forEach(n-> System.out.println("Eid" +n.empid+ "Ename" +n.ename));
		
		//map(retrieve the names of employee in upper case)
		String[] str= {"sam","lavanya","divya","dolly"};
		System.out.println("stored operation");
		List<String> name=Arrays.asList("Bobby","Amith","Sara","Avi");
		//String s = new String();
		//s.toUpperCase
		name.stream().map(String::toUpperCase).forEach(System.out::println);
		
		System.out.println("Stored operations + Map");
		List<String> names=Arrays.asList("Bobby","Amith","Sara","Avi");
		names.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		
		
		System.out.println("reduce operation");
		List<Integer> number = Arrays.asList(10,20,30,40,60);
		//BiFunction<T,U,R> 3 are separate values
		//sum of t and u
		int sum = number.stream().reduce(0, Integer::sum);
		System.out.println("The sum is :"+sum);
		

	}

}
