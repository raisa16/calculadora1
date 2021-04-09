package com.mathapi.entity;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	private int number;
	private List result;
	
	public Fibonacci() {
	}

	public Fibonacci(int number, List result) {
		this.number = number;
		this.result = result;
	}

	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}

	public List getResult() {
		return result;
	}

	public void setResult(List result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "	Fibonacci [number=" + number + ", result=" + result + "]";
	}
	
	
}
