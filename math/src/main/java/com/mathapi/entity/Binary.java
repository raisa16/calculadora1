package com.mathapi.entity;

public class Binary {
	private int decimal;
	private StringBuilder binary;
	public Binary() {
		super();
	}
	public Binary(int decimal, StringBuilder binaryNumber) {
		super();
		this.decimal = decimal;
		this.binary = binaryNumber;
	}
	public int getDecimal() {
		return decimal;
	}
	public void setDecimal(int decimal) {
		this.decimal = decimal;
	}
	public  StringBuilder getBinary() {
		return binary;
	}
	public void setBinary( StringBuilder binary) {
		this.binary = binary;
	}
	@Override
	public String toString() {
		return "Binary [decimal=" + decimal + ", binary=" + binary + "]";
	}
	
	
}
