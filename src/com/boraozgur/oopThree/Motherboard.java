package com.boraozgur.oopThree;

public class Motherboard {
	private String model;
	private String manufacturer;
	private int ramSlots;
	private String bios;

	public void loadProgram(String programName) {
		System.out.println("Program" + programName + "is loading");
	}

	public Motherboard(String model, String manufacturer, int ramSlots, String bios) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.bios = bios;
	}

}
