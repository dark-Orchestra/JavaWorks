package com.boraozgur.oopTwo;

public class Rectangle {
	private double width;
	private double lenght;

	public Rectangle(double width, double lenght) {
		setWidth(width);
		setLenght(lenght);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width < 0) {
			this.width = 0;
		} else {
			this.width = width;
		}
	}

	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		if (lenght < 0) {
			this.lenght = 0;
		} else {
			this.lenght = lenght;
		}
	}

	public double getArea() {
		return width * lenght;
	}

}
