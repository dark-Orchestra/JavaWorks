package com.boraozgur.oopTwo;

public class Cuboid extends Rectangle {

	private double height;

	public Cuboid(double width, double lenght, double height) {
		super(width, lenght);
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
