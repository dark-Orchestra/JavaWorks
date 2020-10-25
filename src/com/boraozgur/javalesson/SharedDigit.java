package com.boraozgur.javalesson;

public class SharedDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
		if (firstNumber < 10 || secondNumber < 10 || firstNumber > 99 || secondNumber > 99) {
			return false;
		}

		String firstString = Integer.toString(firstNumber);
		String secondString = Integer.toString(secondNumber);

		for (int i = 0; i <= firstString.length() - 1; i++) {
			for (int j = 0; j < secondString.length() - 1; j++) {
				if (firstString.charAt(i) == secondString.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}
	

}
