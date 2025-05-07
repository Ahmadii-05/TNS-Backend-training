package com.tnsif.interfacedemo;

public class StringBufferExp {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");              // Append
        sb.insert(5, ",");                // Insert
        sb.replace(0, 5, "Hi");           // Replace
        sb.reverse();                     // Reverse

        System.out.println("StringBuffer: " + sb);  // Output: dlroW ,iH
    
	
	   StringBuilder s = new StringBuilder("Java");

        s.append(" Programming");        // Append
        s.delete(0, 5);                  // Delete
        s.insert(0, "Core ");            // Insert
        s.reverse();                     // Reverse

         System.out.println("StringBuilder: " + s);  // Output: gnimmargorP eroC
  }

}


