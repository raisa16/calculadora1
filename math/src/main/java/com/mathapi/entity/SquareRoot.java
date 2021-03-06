package com.mathapi.entity;

public class SquareRoot {
	private double number;
	private double result;
	
	public SquareRoot() {
		super();
	}
	
	public SquareRoot(double number, double result) {
		super();
		this.number = number;
		this.result = result;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "SquareRoot [number=" + number + ", result=" + result + "]";
	}
	
	
}
