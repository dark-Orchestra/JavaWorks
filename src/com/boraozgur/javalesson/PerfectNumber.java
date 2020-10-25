package com.boraozgur.javalesson;

public class PerfectNumber {

	public static void main(String[] args) {
		isPerfectNumber(6);
	}

	public static boolean isPerfectNumber(int number) {
		if (number < 1)
			return false;

		int sumDivisors = 0;

		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0)
				sumDivisors += i;
		}

		if (sumDivisors == number) {
			return true;
		}
		return false;
	}

}
