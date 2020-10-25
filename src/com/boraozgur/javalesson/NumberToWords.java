package com.boraozgur.javalesson;

public class NumberToWords {

	public static void main(String[] args) {
		numberToWords(100);
	}

	public static void numberToWords(int number) {
		if (number < 0) {
			System.out.println("Invalid Value");
		}
		int reverse = reverse(number);
		int count = getDigitCount(number);
		int revCount = getDigitCount(reverse);
		number = reverse;
		if (number == 0) {
			System.out.println("Zero");
		}
		while (number > 0) {
			int remainder = number % 10;
			switch (remainder) {
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			}
			number /= 10;
		}
		while (count > revCount) {
			System.out.println("Zero");
			count--;
		}
	}

	// Second method starts here
	public static int reverse(int number) {
		int reverse = 0;
		int newNumber = number;
		if (number >= 0) {
			while (newNumber > 0) {
				int remainPrev = newNumber % 10;
				newNumber /= 10;
				reverse = (reverse * 10) + remainPrev;
			}
		} else {
			newNumber = number * (-1);
			while (newNumber > 0) {
				int remainPrev = newNumber % 10;
				newNumber /= 10;
				reverse = (reverse * 10) + remainPrev;
			}
			reverse *= (-1);
		}
		return reverse;
	}

	// third method starts here
	public static int getDigitCount(int number) {
		if (number < 0) {
			return -1;
		}
		int count = 0;
		if (number == 0) {
			count = 1;
		} else {
			while (number > 0) {
				number /= 10;
				count++;
			}
		}
		return count;
	}

}
