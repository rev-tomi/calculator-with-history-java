package com.example.calculator;

public class AddOperation {
	
	private int a;
	private int b;
	
	public AddOperation(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		return a + b;
	}

}
