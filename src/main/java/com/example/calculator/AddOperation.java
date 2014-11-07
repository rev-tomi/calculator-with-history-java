package com.example.calculator;

public class AddOperation implements Operation {
	
	private int a;
	private int b;
	
	public AddOperation(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		doValidityCheck();
		return a + b;
	}

	private void doValidityCheck() {
		checkOverflow(a, b);
		checkOverflow(b, a);
	}

	private void checkOverflow(int a, int b) {
		if (Integer.MAX_VALUE - Math.abs(b) < Math.abs(a)) {
			throw new ArithmeticException("Integer overflow");
		}
	}

}
