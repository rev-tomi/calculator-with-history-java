package com.example.calculator;

import java.util.List;

public class Calculator {
	
	private final ResultStorage storage;
	
	public Calculator(ResultStorage storage) {
		this.storage = storage;
	}

	public void add(int a, int b) {
		Operation operation = getAddOperation(a, b);
		calculate(operation);
	}

	/** Protected for testing reasons */
	protected Operation getAddOperation(int a, int b) {
		return new AddOperation(a, b);
	}

	/** Protected for testing reasons */
	protected void calculate(Operation operation) {
		try {
			storage.add(Integer.toString(operation.calculate()));
		} catch (RuntimeException ex) {
			storage.add("E");
		}
}

	public List<String> getResults() {
		return storage.getStoredResults();
	}
	
	
}
