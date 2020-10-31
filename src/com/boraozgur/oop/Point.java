package com.boraozgur.oop;

public class Point {

	private int x;
	private int y;

	public Point() {
		this(0, 0);
	}

	public Point(int x, int y) {
		setX(x);
		setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double distance() { // distanceWithoutAnyParameters
		return distance(0, 0);
	}

	public double distance(int x, int y) { // distanceWithTwoParametersXYBothOfTypeInt
		return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
	}

	public double distance(Point point) { // distance with parameter of another type Point
		return distance(point.getX(), point.getY());
	}

}
