package com.example.calculator;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class CalculatorOperateTest {
	
	@Test
	public void testGeneralOperation() {
		// GIVEN
		ResultStorage storage = new ResultStorage();
		Calculator calculator = new Calculator(storage);
		
		// WHEN
		calculator.calculate(new PredefinedThreeOperation()); // TODO replace me with a mock
		
		// THEN
		assertEquals(Arrays.asList("3"), storage.getStoredResults());
	}
	
	@Test
	public void testExceptionOperation() {
		// GIVEN
		ResultStorage storage = new ResultStorage();
		Calculator calculator = new Calculator(storage);
		
		// WHEN
		calculator.calculate(new ExceptionalOperation());  // TODO replace me with a mock
		
		// THEN
		assertEquals(Arrays.asList("E"), storage.getStoredResults());
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
