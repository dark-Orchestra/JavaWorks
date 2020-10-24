package com.boraozgur.javalesson;

public class IsLeapYear {

	public static void main(String[] args) {
		//printNumberInWord(1);
		
	}
	public static void printNumberInWord(int number) {
		switch (number) {
		case 0:
			System.out.println("ZERO");
			break;
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 7:
			System.out.println("SEVEN");
			break;
		case 8:
			System.out.println("EIGHT");
			break;
		case 9:
			System.out.println("NINE");
			break;
		default:
			System.out.println("OTHER");
			break;
		}
	}

	public static boolean isLeapYear(int year) {
		if (year < 1 || year >= 9999) {
			return false;
		}
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

	public static int getDaysInMonth(int month, int year) {

		if (month < 1 || month > 12 || year < 1 || year > 9999) {
			return -1;
		}
		if (isLeapYear(year)) {
			if (month == 2) {
				return 29;
			}
		}

		switch (month) {
		case 2:
			return 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			return 31;
		}

	}
 
	
	
}
