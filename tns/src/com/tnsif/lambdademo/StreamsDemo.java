package com.tnsif.lambdademo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Ankit", "John");

		// Without Stream
		List<String> result = new ArrayList<>();
		for (String name : names) {
		    if (name.startsWith("A")) {
		        result.add(name.toUpperCase());
		    }
		}
		 System.out.println("Result using traditional for-loop: " + result);

		// With Stream
		System.out.println("\nProcessing using Stream API...");

		List<String> results = names.stream()
		    .filter(name -> name.startsWith("A"))
		    .map(String::toUpperCase)
		    .collect(Collectors.toList());
		  System.out.println("Result using Stream API: " + results);
	}

}
