package com.tnsif.stringdemo;

public class Reference {
	//Reference Type
	    public static void main(String[] args) {
	        String s1 = new String("tesla");
	        String s2 = s1;  //references the same object
	        String s3 = new String("tesla");  // new object with same content

	        System.out.println(s1 == s2);      //both refer to same object              // true
	        System.out.println(s1 == s3);       //different objects but same content    // false                                
	        System.out.println(s1.equals(s3)); //checks content                        // true
	        System.out.println(s1.compareTo(s3));  //Lexicographically they are identical  // 0
            System.out.println(s1.equals(s2));     //true
}
}
