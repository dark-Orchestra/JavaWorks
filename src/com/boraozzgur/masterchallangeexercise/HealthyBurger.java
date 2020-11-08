package com.boraozzgur.masterchallangeexercise;

public class HealthyBurger extends Hamburger {

	private String healthyExtra1Name;
	private double healthy1Price;

	private String healthyExtra2Name;
	private double healthy2Price;

	public HealthyBurger(String meat, double price) {
		super("Healthy", meat, price, "Brown rye");
	}

	public void addHealtyAddition1(String name, double price) {
		this.healthyExtra1Name = name;
		this.healthy1Price = price;
	}

	public void addHealtyAddition2(String name, double price) {
		this.healthyExtra2Name = name;
		this.healthy2Price = price;
	}

	@Override
	public double itemizeHamburger() {
		double hamburgerPrice = super.itemizeHamburger();
		if (this.healthyExtra1Name != null) {
			hamburgerPrice += healthy1Price;
			System.out.println("Added" + this.healthyExtra1Name + " for an extra" + this.healthy1Price);
		}
		if (this.healthyExtra2Name != null) {
			hamburgerPrice += healthy2Price;
			System.out.println("Added" + this.healthyExtra2Name + " for an extra" + this.healthy2Price);
		}

		return hamburgerPrice;
	}

}
