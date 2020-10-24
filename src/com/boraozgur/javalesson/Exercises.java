package com.boraozgur.javalesson;

public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isOdd(int number) {
		if (number < 0)
			return false;

		if (number % 2 != 0) {
			return true;
		}
		return false;
	}

	public static int sumOdd(int startNumber, int endNumber) {
		if (startNumber < 0 || endNumber < 0 || startNumber > endNumber) {
			return -1;
		}

		int total = 0;

		for (int i = startNumber; i <= endNumber; i++) {
			if (isOdd(i)) {
				total += i;
			}
		}

		return total;
	}
	
	

}
