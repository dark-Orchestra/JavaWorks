package com.boraozgur.javalesson;

public class LastDigitChecker {

	public static void main(String[] args) {
		hasSameLastDigit(41, 22, 71);
	}

	public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
		if (!isValid(firstNumber) || !isValid(secondNumber) || !isValid(thirdNumber))
			return false;

		firstNumber = firstNumber % 10;
		secondNumber = secondNumber % 10;
		thirdNumber = thirdNumber % 10;
		return ((firstNumber == secondNumber || firstNumber == thirdNumber || secondNumber == thirdNumber) ? true
				: false);
	}

	public static boolean isValid(int number) {
		if (number >= 10 && number <= 1000) {
			return true;
		}
		return false;
	}

}
