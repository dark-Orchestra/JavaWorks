package com.boraozgur.javalesson;

public class FirstAndLastDigitSum {

	public static void main(String[] args) {
		sumFirstAndLastDigit(123123);
	}
	
	public static int sumFirstAndLastDigit(int number) {
		if (number < 0) {
			return -1;
		} else {
			int lastDigit = number % 10;
			while (number > 9) {
				number /= 10;
			}
			int sum = number + lastDigit;
			return sum;
		}
	}
}
