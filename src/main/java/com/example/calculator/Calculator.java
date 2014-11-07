package com.example.calculator;

public class Calculator {
	
	private final ResultStorage storage;
	
	public Calculator(ResultStorage storage) {
		this.storage = storage;
	}

	public void add(int a, int b) {
		getAddOperation(a, b);
	}

	/** Protected-private for testing reasons */
	protected Operation getAddOperation(int a, int b) {
		return null;
	}

	/** Package-private for testing reasons */
	void calculate(Operation operation) {
		try {
			storage.add(Integer.toString(operation.calculate()));
		} catch (RuntimeException ex) {
			storage.add("E");
		}
}
	
	
}
