package com.example.calculator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorFindOperatorTest {
	
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
		
		public AddCalledCalculator() {
			super(null);
		}
		
		private boolean getAddOperationCalled;
		
		@Override
		protected Operation getAddOperation(int a, int b) {
			getAddOperationCalled = true;
			return null;
		}
		
	}
	
}
