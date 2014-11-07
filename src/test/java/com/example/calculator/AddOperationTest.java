package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddOperationTest {

	@Test
	public void testAdding() {
		// GIVEN
		int a = 1;
		float b = 2.0F;
		AddOperation operation = new AddOperation(a, b);
		
		// WHEN
		double sum = operation.calculate();
		
		// THEN
		assertEquals(3.0, sum, 0.0001);
	}

}
