package com.example.calculator;

public class AddOperation {
	
	private double a;
	private double b;
	
	public AddOperation(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double calculate() {
		return a + b;
	}

}
