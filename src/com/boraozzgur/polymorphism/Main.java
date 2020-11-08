package com.boraozzgur.polymorphism;

public class Main {

	public static void main(String[] args) {
		Car car = new Car(8, "Base Car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());

		Car mitsubishi = new Mitsubishi(6, "Mitsubishi Car");
		System.out.println(mitsubishi.startEngine());
		System.out.println(mitsubishi.accelerate());
		System.out.println(mitsubishi.brake());

	}

}
