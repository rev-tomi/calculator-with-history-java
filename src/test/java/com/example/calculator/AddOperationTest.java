package com.example.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddOperationTest {

	@Test
	public void testAdding() {
		// GIVEN
		int a = 1;
		int b = 2;
		AddOperation operation = new AddOperation(a, b);
		
		// WHEN
		int sum = operation.calculate();
		
		// THEN
		assertEquals(3, sum);
	}
	
	@Test
	public void testAddingNegative() {
		// GIVEN
		int a = -5;
		int b = 2;
		AddOperation operation = new AddOperation(a, b);
		
		// WHEN
		int sum = operation.calculate();
		
		// THEN
		assertEquals(-3, sum);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testOverflow() {
		// GIVEN
		AddOperation operation = new AddOperation(Integer.MAX_VALUE, 2);
		
		// WHEN
		operation.calculate();
	}
}
