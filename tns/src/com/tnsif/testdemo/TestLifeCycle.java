package com.tnsif.testdemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestLifeCycle {
	
	@BeforeEach
	void beforeEachTest() {
		System.out.println("Before each test");
    }
	
	@AfterEach
	void afterEachTest() {
		System.out.println("After each test");
	}
	
	@BeforeAll
	void beforeAllTest() {
		System.out.println("Before all test");
	}
	
	@AfterAll
	void afterAllTest() {
		System.out.println("After all test");
	}
	
	@Test
	void testMethod1() {
		System.out.println("this is a test method1..");
	}
	
	@Test
	void testMethod2() {
		System.out.println("this is a test method2..");
	}
	

}
