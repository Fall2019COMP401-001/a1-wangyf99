package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// Read in count of numbers of items in the store to process
		
		int count = scan.nextInt();
		
		// Create an array to store strings of the food.
		
		String[] menu = new String[count];
		
		// Create an array to store integers of the food price.
		
		Double[] prices = new Double[count];
		
		// Read values into the array
		
				for (int i=0; i < menu.length; i++) {

					menu[i] = scan.next();
					prices[i] = scan.nextDouble();
					
				}	
				
		// Read in count of numbers of buyers
				
				int consensus = scan.nextInt();
				
		// Create an array to store strings of buyer's name.
				
				String[] name = new String[consensus];	
				
		// Create an array to store values of each buyer's total price.
				
				Double[] totalPrice = new Double [consensus];		
				
				for (int x = 0; x < consensus; x++) {
		// Read values of each person's name into the array	
					
					name[x] = scan.next() + " " + scan.next();
					
		// Read in count of numbers of items bought by each person
				
				int number = scan.nextInt();
				
		// Create an array to store numbers.
				
				double[] price = new double[number];
				
		// Read values of total price paid for each fruit into the array
				
				for (int i=0; i < price.length; i++) {
					int fruitNumber = scan.nextInt();
					String fruitName = scan.next();
					
					for (int u = 0; u < menu.length; u++) {
						
						if (fruitName.equals(menu[u])) {
							
							price[i] += fruitNumber * prices[u];
							
						}
					}

				}
				
			

		// Read values of total price each person buy into the array
				
				totalPrice[x] = findTotalPrice(price);
				
				}
		
		// All input parsed, so close scanner
				
				scan.close();			
				
		//Initialize current maximum to first value in array.
				double cur_max = totalPrice[0];
				
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
				int index = 0;
				for (int i=1; i < totalPrice.length; i++) {
					if (totalPrice[i] > cur_max) {
						cur_max = totalPrice[i];
						index = i;
					}
					
				}		
				System.out.println("Biggest: " + name[index] + " (" + String.format("%.2f",cur_max) + ")");
				
		// Initialize current minimum to first value in array.
				
				Double cur_min = totalPrice[0];
				
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
				
				int indexSmall = 0;
				for (int i=1; i < consensus; i++) {
					if (cur_min > totalPrice[i]) {
						cur_min = totalPrice[i];
						indexSmall = i;
					} 
					
				}
				System.out.println("Smallest: " + name[indexSmall] + " (" + String.format("%.2f",cur_min) + ")");
				
		// Calculate value average
				double sum = 0.0;
				
				for (int i=0; i<totalPrice.length; i++) {
					sum += totalPrice[i];
				}
				
				System.out.println("Average: " + String.format("%.2f", ((double) sum) / ((double) consensus)));

	}

	/* findTotalPrice
	 * Finds and returns the total price each customer pays
	 * 
	 * Input: array of prices for each item each customer pays
	 * 
	 * Output: number of total price each customer pays
	 * 
	 * Preconditions:
	 * Input array must not be null and must contain at least one value.
	 */
	
	static double findTotalPrice(double[] vals) {
		
		double sum = 0.0;
		
		for (int i = 0; i < vals.length; i++) {
			sum += vals[i];
		}
		
		return sum;
	}
	/* findValueMin
	 * Finds and returns the minimum value in an array of integers
	 * 
	 * Input: array of integers vals
	 * 
	 * Output: minimum value found within the array
	 * 
	 * Preconditions:
	 * Input array must not be null and must contain at least one value.
	 */
	
	static int findValueMinAndItsOwner(int[] vals) {
		
		// Initialize current minimum to first value in array.
		int cur_min = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] < cur_min) {
				cur_min = vals[i];
			}
		}
		
		return cur_min;
	}

	/* findValueMax
	 * Finds and returns the maximum value in an array of integers
	 * 
	 * Input: array of integers vals
	 * 
	 * Output: maximum value found within the array
	 * 
	 * Preconditions:
	 * Input array must not be null and must contain at least one value.
	 */
	
	static int findValueMax(int[] vals) {
		
		// Initialize current minimum to first value in array.
		int cur_max = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
			}
		}
		
		return cur_max;
	}
}
