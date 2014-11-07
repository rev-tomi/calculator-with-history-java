package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorOperatorTest extends Calculator {
	
	@Test
	public void testGettingTheRightOperation() {
		// GIVEN
		AddCalledCalculator calculator = new AddCalledCalculator();
		
		// WHEN
		calculator.add(2, 3);
		
		// THEN
		assertTrue(calculator.getAddOperationCalled);
	}
	
	
	private static class AddCalledCalculator extends Calculator {
		
		private boolean getAddOperationCalled;
		
		@Override
		protected Operation getAddOperation(int a, int b) {
			getAddOperationCalled = true;
			return null;
		}
		
	}
	
}
