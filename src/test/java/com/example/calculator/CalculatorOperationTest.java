package com.example.calculator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorOperationTest {
	
	@Test
	public void testGettingTheRightOperation() {
		// GIVEN
		AddCalledCalculator calculator = new AddCalledCalculator();
		
		// WHEN
		calculator.add(2, 3);
		
		// THEN
		assertTrue(calculator.getAddOperationCalled);
	}
	
	@Test
	public void testCallingCalculate() {
		// GIVEN
		CalculateCalledCalculator calculator = new CalculateCalledCalculator();
		
		// WHEN
		calculator.add(1, 2);
		
		// THEN
		assertTrue(calculator.calledWithRightOperation);
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
		
		@Override
		protected void calculate(Operation operation) {
			// NOP: avoiding NPE
		}
	}
	
	private static class CalculateCalledCalculator extends Calculator {

		private boolean calledWithRightOperation;
		
		public CalculateCalledCalculator() {
			super(null);
		}
		
		@Override
		protected void calculate(Operation operation) {
			calledWithRightOperation = operation instanceof AddOperation;
		}
		
	}
	
}
