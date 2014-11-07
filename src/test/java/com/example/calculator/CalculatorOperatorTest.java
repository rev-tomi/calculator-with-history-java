package com.example.calculator;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class CalculatorOperatorTest {
	
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
	public void testGeneralOperation() {
		// GIVEN
		ResultStorage storage = new ResultStorage();
		Calculator calculator = new Calculator(storage);
		
		// WHEN
		calculator.calculate(new PredefinedThreeOperation());
		
		// THEN
		assertEquals(Arrays.asList("3"), storage.getStoredResults());
	}
	
	@Test
	public void testExceptionOperation() {
		// GIVEN
		ResultStorage storage = new ResultStorage();
		Calculator calculator = new Calculator(storage);
		
		// WHEN
		calculator.calculate(new ExceptionalOperation());
		
		// THEN
		assertEquals(Arrays.asList("E"), storage.getStoredResults());
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
	
	private static class PredefinedThreeOperation implements Operation {

		@Override
		public int calculate() {
			return 3;
		}
		
	}
	
	private static class ExceptionalOperation implements Operation {
		@Override
		public int calculate() {
			throw new RuntimeException("Test exception");
		}
	}
	
}
