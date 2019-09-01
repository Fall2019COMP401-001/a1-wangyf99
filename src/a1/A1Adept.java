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
				
		// Read each person's name, number, fruitNumber, and fruitName into the array and repeat it to each new person
				
				for (int x = 0; x < consensus; x++) {
					
		// Read values of each person's name into the array	
					
					name[x] = scan.next() + " " + scan.next();
					
		// Read in count of numbers of items bought by each person
				
				int number = scan.nextInt();
				
		// Create an array to store numbers.
				
				double[] price = new double[number];
				
		// Read values of total price paid for each fruit into the array
				
				for (int i=0; i < price.length; i++) {
					
					// Read in fruitNumber and fruitName into temporary variables
					
					int fruitNumber = scan.nextInt();
					String fruitName = scan.next();
					
					// Compare fruitName to each fruit on the menu until we find the correct one
					// Calculate out the price each person paid on each fruit and read it into the array of price
					
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
		// keep in track of the index of the minimum value on name
				
				int index = 0;
				for (int i=1; i < totalPrice.length; i++) {
					if (totalPrice[i] > cur_max) {
						cur_max = totalPrice[i];
						index = i;
					}
					
				}		
				
				// Print results
				
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
				
				// Print results
				
				System.out.println("Smallest: " + name[indexSmall] + " (" + String.format("%.2f",cur_min) + ")");
				
		// Calculate value average
				
				double sum = 0.0;
				
				for (int i=0; i<totalPrice.length; i++) {
					sum += totalPrice[i];
				}
				
				// Print results
				
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

}
