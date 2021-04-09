package com.mathapi.entity;

public class Prime {
	private int number;
	private boolean isPrime;
	
	public Prime() {
	}
	
	public Prime(int number, boolean isPrime) {
		this.number = number;
		this.isPrime = isPrime;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isResult() {
		return isPrime;
	}
	public void setResult(boolean isPrime) {
		this.isPrime = isPrime;
	}
	@Override
	public String toString() {
		return "Prime [number=" + number + ", isPrime=" + isPrime + "]";
	}
	
	
}
