package com.boraozgur.arrays;

public class Main {
	public static void main(String[] args) {
		int[] myIntArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		printArray(myIntArray);

		int[] mySecoundArray = getIntArray(5);

	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element" + i + "value is " + array[i]);
		}
	}

	private static int[] getIntArray(int number) {
		if (number <= 0) {
			return null;
		}

		int[] array = new int[number];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}

		return array;
	}

	public static int getAverage(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum / array.length;
	}

}
