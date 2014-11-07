package com.example.calculator;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ResultStorageTest {

	@Test
	public void test() {
		// GIVEN
		ResultStorage storage = new ResultStorage();
		
		// WHEN
		storage.add("2");
		storage.add("E");
		storage.add("3");
		
		// THEN
		assertEquals(Arrays.asList("2", "E", "3"), storage.getStoredResults());
	}

}
