package ExerciseOne;

public class TaskFiveArrayEvenOddSum {

	public static void main(String[] args) {

		/*
		 * Create a 2D array of integers. Develop a program which will calculate the sum
		 * of even and odd numbers for that array.
		 */

		int[][] array = { { 8, 19, 54, 98, 67, 43 }, { 9, 7, 6, 12 } };

		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] % 2 == 0) {
					sumEven += array[i][j];
				} else {
					sumOdd += array[i][j];
				}
			}
		}
		System.out.println("The sum of the even numbers in this array is " + sumEven);
		System.out.println("The sum of the odd numbers in this array is " + sumOdd);

	}

}
