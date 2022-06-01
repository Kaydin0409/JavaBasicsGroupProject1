package ExerciseOne;

import java.util.Scanner;

public class TaskTwoScannerArrayCountries {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of countries. When an array is created, retrieve all values 
		 * from it and while retrieving those values 
		 * print capital for each country. (use 2 different loops).
		 */
		
		String[] country = new String[4];
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 3 countries");
		String capital = null;
		
		for (int i = 0; i < country.length; i++) {
			country[i] = input.next();
			if (country[i].equalsIgnoreCase("Turkey")) {
				capital = "Ankara";
			} else if (country[i].equalsIgnoreCase("France")) {
				capital = "Paris";
			} else if (country[i].equalsIgnoreCase("England")) {
				capital = "London";
			} else {
				capital = "Unknown";
			}
			System.out.println("The capital for " + country[i] + " is " + capital);
		}
		
		//another loop
				for(String x:country) {
				x=input.next();
					if(x.equalsIgnoreCase("Turkey")) {
						capital = "Ankara";
					}else if (x.equalsIgnoreCase("France")) {
						capital = "Paris";
					} else if (x.equalsIgnoreCase("London")) {
						capital = "England";
					} else {
						capital = "Unknown";
					}
					System.out.println("The capital for " + x + " is " + capital);
				}
		input.close();
		
	}
		}


	
