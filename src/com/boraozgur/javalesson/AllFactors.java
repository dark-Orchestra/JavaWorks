package com.boraozgur.javalesson;

public class AllFactors {

	public static void main(String[] args) {
		printFactors(6);
	}
	
	public static void printFactors(int number) {
		if (number < 0) {
			System.out.println("Invalid Value");
		} else {
			for (int i = 1; i <= number; i++) {
				int factors = number % i;
				if (factors == 0) {
					System.out.println(i);
				}
			}
		}
	}
}
