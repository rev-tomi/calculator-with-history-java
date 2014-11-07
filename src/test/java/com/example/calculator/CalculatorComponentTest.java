package com.example.calculator;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class CalculatorComponentTest {
	
	private ResultStorage storage;
	private Calculator calculator;
	
	@Before
	public void setUp() {
		storage = new ResultStorage();
		calculator = new Calculator(storage);
	}
	
	@Test
	public void addTest() {
		// WHEN
		calculator.add(1, 2);
		calculator.add(-5, 1);
		
		// THEN
		assertEquals(Arrays.asList("3", "-4"), calculator.getResults());
	}

}
