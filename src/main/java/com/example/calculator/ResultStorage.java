package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class ResultStorage {
	
	private final List<String> list = new ArrayList<>();

	public void add(String string) {
		list.add(string);
	}

	public List<String> getStoredResults() {
		return new ArrayList<>(list);
	}

}
