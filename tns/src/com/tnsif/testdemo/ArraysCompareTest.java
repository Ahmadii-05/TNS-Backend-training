package com.tnsif.testdemo;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ArraysCompareTest {
	@Test
	public void testArraySort() {
		int[] numbers = {12, 3, 4, 8, 1};
		int[] expected = {1, 3, 4, 8, 12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	@Test
	public void testArrayNullArray() {
		int numbers[] = null;
		Assertions.assertThrows(NullPointerException.class, () -> Arrays.sort(numbers));
	}

}
