package com.example.calculator;

import static org.junit.Assert.*;

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

}
