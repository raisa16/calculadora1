package com.mathapi.entity;

public class Division {
	private int divisor;
	private int dividend;
	private int quotient;
	private int remainder;
	public Division() {
		super();
	}
	public Division(int divisor, int dividend, int quotient, int remainder) {
		super();
		this.divisor = divisor;
		this.dividend = dividend;
		this.quotient = quotient;
		this.remainder = remainder;
	}
	public int getDivisor() {
		return divisor;
	}
	public void setDivisor(int divisor) {
		this.divisor = divisor;
	}
	public int getDividend() {
		return dividend;
	}
	public void setDividend(int dividend) {
		this.dividend = dividend;
	}
	public int getQuotient() {
		return quotient;
	}
	public void setQuotient(int quotient) {
		this.quotient = quotient;
	}
	public int getRemainder() {
		return remainder;
	}
	public void setRemainder(int remainder) {
		this.remainder = remainder;
	}
	@Override
	public String toString() {
		return "Division [divisor=" + divisor + ", dividend=" + dividend + ", quotient=" + quotient + ", remainder="
				+ remainder + "]";
	}
	
	
}
