package com.mathapi.entity;

public class Euler {
	private double power;
	private double result;
	
	public Euler() {
	}

	public Euler(double power, double result) {
		super();
		this.power = power;
		this.result = result;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Euler [power=" + power + ", result=" + result + "]";
	}
	
	
	
	
}
