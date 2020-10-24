package com.boraozgur.javalesson;

public class NumberPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-111)); 		
	}
	
	public static boolean isPalindrome(int number) {
		if (number < 0) {
			number = Math.abs(number);
		}

		String value = Integer.toString(number);

		String newValue = "";

		for (int i = value.length() - 1; i >= 0; i--) {
			newValue += Character.toString(value.charAt(i));
		}

		if (value.equals(newValue))
			return true;

		return false;
	}

}
