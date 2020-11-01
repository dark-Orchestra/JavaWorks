package com.boraozgur.oopTwo;

public class Sylinder extends Circle {

	private double height;

	public Sylinder(double radius, double height) {
		super(radius);
		setHeight(height);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height < 0) {
			this.height = 0;
		} else {
			this.height = height;
		}
	}

	public double getVolume() {
		return super.getArea() * height;
	}

}
