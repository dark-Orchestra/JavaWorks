package com.boraozgur.javalesson;

public class FlourPack {

	public static void main(String[] args) {
		canPack(1, 0, 4);
	}

	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if (bigCount < 0 || smallCount < 0 || goal < 1) {
			return false;
		}
		final int bigWeight = 5;

		while (bigCount >= 0) {
			int kilosInBigCount = bigCount * bigWeight;
			for (int i = 0; i <= smallCount; i++) {
				int sum = kilosInBigCount + i;
				if (sum == goal) {
					return true;
				} // end if
			} // end for
			bigCount--;
		} // end while
		return false;
	}

}
