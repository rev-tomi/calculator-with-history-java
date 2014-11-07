package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorOperatorTest extends Calculator {
	
	private boolean getAddOperationCalled;

	@Test
	public void testGettingTheRightOperation() {
		// GIVEN
		Calculator calculator = new Calculator();
		
		// WHEN
		calculator.add(2, 3);
		
		// THEN
		assertTrue(getAddOperationCalled);
	}
	
	@Override
	protected Operation getAddOperation(int a, int b) {
		getAddOperationCalled = true;
		return null;
	}
	
}
