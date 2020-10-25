package com.boraozgur.javalesson;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {
		if (firstNumber < 10 || secondNumber < 10)
			return -1;

		int smallnumber = firstNumber > secondNumber ? secondNumber : firstNumber;
		int greatestDivisor = 1;

		for (int i = 1; i <= smallnumber; i++) {
			if (firstNumber % i == 0 && secondNumber % i == 0)
				greatestDivisor = i;
		}

		return greatestDivisor;
	}

}
