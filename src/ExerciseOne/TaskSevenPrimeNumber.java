package ExerciseOne;

public class TaskSevenPrimeNumber {

	public static void main(String[] args) {
		/*
		 * Write a java program to check whether a given number is prime or not
		 */

		int inputNumber = 3;

		boolean Prime = true;

		for (int i = 2; i <= inputNumber / 2; i++) {
			if ((inputNumber % i) == 0) {
				Prime = false;
			} else {
				Prime = true;
			}
		}
		if (Prime) {
			System.out.println(inputNumber + " is a prime number.");
		} else {
			System.out.println(inputNumber + " is not a prime number");
		}

	}
}
