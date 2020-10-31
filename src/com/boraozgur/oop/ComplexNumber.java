package com.boraozgur.oop;

public class ComplexNumber {
	private double real;
	private double imaginary;

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}

	public void add(double real, double imaginary) {
		this.real += real;
		this.imaginary += imaginary;
	}

	public void add(ComplexNumber number) {
		this.real += number.getReal();
		this.imaginary += number.getImaginary();
	}

	public void subtract(double real, double imaginary) {
		this.real -= real;
		this.imaginary -= imaginary;
	}

	public void subtract(ComplexNumber number) {
		this.real -= number.getReal();
		this.imaginary -= number.getImaginary();
	}

}
