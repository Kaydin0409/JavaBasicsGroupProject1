package ExerciseOne;

public class TaskNineMaxMinArray {

	public static void main(String[] args) {
		// Maximum and minimum number in the array

		int[] array= {28, 79, 102, 58, 93, 4, 37};
		
		int max=array[0];
		int min=array[0];
		
		for(int i=1; i<array.length; i++) {
			if(array[i] < min)
			{
				min=array[i];
			}if(array[i]>max){
				max=array[i];
			}
		}
			System.out.println("The largest element is "+max);
			System.out.println("The smallest element is "+min);
			

	}

}
