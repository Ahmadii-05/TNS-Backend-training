package com.tnsif.testdemo;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

//Demo for writing test cases
public class TestMathoperations {
	//positive number
	@Test
	public void testForPositive() {
		Assertions.assertTrue(MathOperations.positiveNumber(8));
	}
	
	//negative number
	@Test
	public void testForNegative(){
		 Assertions.assertFalse(MathOperations.positiveNumber(-8));
		
	}

}
