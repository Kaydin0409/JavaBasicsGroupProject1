package ExerciseOne;

public class TaskEightFibonacciSeries {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.

		int t1=0, t2=1;
		
		int terms=13;
		
		 for (int i = 1; i <= terms; ++i)
	        {
	            System.out.print(t1 + " ");
	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }

	}

}
