package ExerciseOne;

public class TaskTenSecondLargest {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array
		
			int[] array= {5, 28, 36, 1, 14, 56, 48, 17};
		
			int max=array[0];
			int max2=array[0];
			
			
			for(int i=0; i<array.length; i++) {
				if(array[i]>max) {
					max2=max;
					max=array[i];
				
				}else if(array[i]>max2) {
					max2=array[i];
				}
					
			}
			System.out.println("The second largest number in the array is "+max2);
			
			
			

	}

}
