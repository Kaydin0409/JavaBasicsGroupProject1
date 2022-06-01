package ExerciseOne;

public class TaskElevenDuplicateElements {

	public static void main(String[] args) {
		// Write a program to print out duplicate elements from an Array of Strings

		int[] num = { 1, 5, 50, 6, 50, 12, 1 };

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {

					System.out.println(num[i] + " and " + num[j]);
				}
			}
		}

	}

}
