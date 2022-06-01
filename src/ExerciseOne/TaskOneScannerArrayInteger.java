package ExerciseOne;

import java.util.Scanner;

public class TaskOneScannerArrayInteger {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of integer values. After the array is created,
		 * calculate the sum of all stored elements in that array.
		 */

		Scanner scanner = new Scanner(System.in);

		int[] array = new int[4];

		int sum = 0;

		for (int i = 0; i < array.length; i++) {

			System.out.println("Please enter an integer");
			int input = scanner.nextInt();
			array[i] = input;
			sum += input;

		}
		System.out.println("The sum of all the elements in this array = " + sum);
		
		scanner.close();

	}

}
