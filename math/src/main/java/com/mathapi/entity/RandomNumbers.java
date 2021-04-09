package com.mathapi.entity;

import java.util.List;

public class RandomNumbers {
	private int number;
	private int min;
	private int max;
	private List result;
	
	public RandomNumbers() {
		super();
	}

	public RandomNumbers(int number, int min, int max, List result) {
		super();
		this.number = number;
		this.max = max;
		this.min = min;
		this.result = result;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public List getResult() {
		return result;
	}

	public void setResult(List result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "RandomNumbers [number=" + number + ", max=" + max + ", min=" + min + ", result=" + result + "]";
	}
	
	
}
