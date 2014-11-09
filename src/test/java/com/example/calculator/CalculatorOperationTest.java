package com.example.calculator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorOperationTest {
	
	@Test
	public void testGettingTheRightOperation() {
		// GIVEN
		SpyAddOperationCalculator calculator = new SpyAddOperationCalculator();
		
		// WHEN
		calculator.add(2, 3);
		
		// THEN
		assertTrue(calculator.getAddOperationCalled);
	}
	
	@Test
	public void testCallingCalculate() {
		// GIVEN
		SpyCalculateTemplateCalculator calculator = new SpyCalculateTemplateCalculator();
		
		// WHEN
		calculator.add(1, 2);
		
		// THEN
		assertTrue(calculator.calledWithRightOperation);
	}
	
	/*******************
	 *  INNER CLASSES  *
	 *******************/
	
	private static class SpyAddOperationCalculator extends Calculator {
		
		public SpyAddOperationCalculator() {
			super(new ResultStorage());
		}
		
		private boolean getAddOperationCalled;
		
		@Override
		protected Operation getAddOperation(int a, int b) {
			getAddOperationCalled = true;
			return null;
		}

	}
	
	private static class SpyCalculateTemplateCalculator extends Calculator {

		private boolean calledWithRightOperation;
		
		public SpyCalculateTemplateCalculator() {
			super(null);
		}
		
		@Override
		protected void calculate(Operation operation) {
			calledWithRightOperation = operation instanceof AddOperation;
		}
		
	}
	
}
