package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// Read in count of numbers of customers to process
		
				int count = scan.nextInt();
				
				for (int u = 0; u < count; u++) {
					
				// Create an array to store strings of one person.
				
				String[] values = new String[2];
				
				for (int i = 0; i<values.length; i++) {
					values[i] = scan.next();
				}
				
				// Read in count of number of items to process.
				
				int number = scan.nextInt();
				
				//Create an array to store numbers.
				
				Double[] price = new Double[number];
				
				// Read values into the array
				
				for (int i=0; i<price.length; i++) {
					int next1 = scan.nextInt();
					String next = scan.next();
					Double next2 = scan.nextDouble();
					price[i] = next1 * next2;
				}
				
				String name = findNameOfCustomer(values);
				
				Double priceValue = findTotalPrice(price);
				
				// Print results
				
				System.out.println(name + String.format("%.2f" , priceValue));
				

			}
				// All input parsed, so close scanner
				
				scan.close();
				

				
			}
	
			/* findNameOfCustomer
			 * Finds and returns the name of customer in the final way
			 * 
			 * Input: array of customer name
			 * 
			 * Output: customer name in first name last name form
			 * 
			 * Preconditions:
			 * Input array must not be null and must contain at least one value.
			 */
			
			static String findNameOfCustomer(String[]vals) {
				
				return vals[0].charAt(0) + "." + " " + vals[1] + ":" + " ";
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
			
			static Double findTotalPrice(Double[] vals) {
				
				Double sum = 0.0;
				
				for (int i = 0; i < vals.length; i++) {
					sum += vals[i];
				}
				
				return sum;
			}
		
}
