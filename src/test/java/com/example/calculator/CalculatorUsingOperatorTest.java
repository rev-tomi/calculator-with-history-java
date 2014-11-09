package com.example.calculator;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class CalculatorUsingOperatorTest {
	
	private ResultStorage storage;
	private Calculator calculator;
	
	@Before
	public void setUp() {
		storage = new ResultStorage();
		calculator = new Calculator(storage);
	}
	
	@Test
	public void testGeneralOperation() {
		// WHEN
		calculator.calculate(new PredefinedThreeOperation());
		
		// THEN
		assertEquals(Arrays.asList("3"), storage.getStoredResults());
	}
	
	@Test
	public void testExceptionOperation() {
		// WHEN
		calculator.calculate(new ExceptionalOperation());
		
		// THEN
		assertEquals(Arrays.asList("E"), storage.getStoredResults());
	}
	
	/*******************
	 *  INNER CLASSES  *
	 *******************/
	
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
