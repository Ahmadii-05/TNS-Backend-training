package com.tnsif.variablesdemo;
//Demo for static variables
public class Student {
  int sid;
  String sname;
  static String collegename="Sri Indu";
  
  void display() {
	  System.out.println("the details of students " +sid+"," +sname+"," +Student.collegename);
  }
}
