package ExerciseOne;

public class TaskThree2DArrayIntegers {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integer values. Print the sum of all numbers.
		 */

		int[][] values = { { 5, 8, 10, 11 }, { 12, 15, 49, 53 } };

		int sum = 0;

		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				sum += values[i][j];
			}
		}
		System.out.println("The sum of all numbers in array is " + sum);

	}

}
