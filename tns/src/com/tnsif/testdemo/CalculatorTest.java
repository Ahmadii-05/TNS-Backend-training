package com.tnsif.testdemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class CalculatorTest {

	 Calculator calculator = new Calculator();

	    @Test
	    public void testAdd() {
	        assertEquals(5, calculator.add(2, 3));
	        assertEquals(0, calculator.add(-2, 2));
	    }

	    @Test
	    public void testDivide() {
	        assertEquals(2, calculator.divide(10, 5));
	    }

	    @Test
	    public void testDivideByZero() {
	        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	            calculator.divide(10, 0);
	        });

	        assertEquals("Division by zero", exception.getMessage());
	    }
	}


