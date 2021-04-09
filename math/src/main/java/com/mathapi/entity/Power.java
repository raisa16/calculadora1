package com.mathapi.entity;

public class Power {
	private double base;
	private double power;
	private double result;
	
	public Power() {
		super();
	}

	public Power(double base, double power, double result) {
		super();
		this.base = base;
		this.power = power;
		this.result = result;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
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
		return "Power [base=" + base + ", power=" + power + ", result=" + result + "]";
	}
	
	
}
