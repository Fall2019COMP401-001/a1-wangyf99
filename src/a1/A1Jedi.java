package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// Read in count of numbers of items in the store to process
		
		int count = scan.nextInt();
				
		// Create an array to store strings of the food.
				
		String[] menu = new String[count];
				
		// Read values into the array
				
				for (int i=0; i < menu.length; i++) {

					menu[i] = scan.next();
					scan.nextDouble();
							
				}	
						
		// Read in count of numbers of buyers
						
				int consensus = scan.nextInt();
						
		// Create an array to store number bought for each item.
						
				int[] fruitNumber = new int[count];	
	
		// Create an array to store number of customers who bought each item.
				
				int[] fruitCustomer = new int[count];	
				
				for (int x = 0; x < consensus; x++) {
				
		// Skip values of each person's name and how m	
								
				scan.next();
				scan.next();	
				
		// Read in count of numbers of items bought by each person
				
				int number = scan.nextInt();	
				
				int[] arrayOfHowManyTimesFruitAppeared = new int[count];
				
				for (int i=0; i < number; i++) {					
				
		// Read in count of number of item bought by one person
					
					int numberItem = scan.nextInt();
					
		// Read in count of number of item bought by one person
					
					String fruitName = scan.next();										
					
					for (int u = 0; u < menu.length; u++) {
						
						if (fruitName.equals(menu[u])) {
							
							fruitNumber[u] += numberItem;	
							
							arrayOfHowManyTimesFruitAppeared[u] += 1;
							
						}						
						
					}					
	
				}
		

		// put in the value of the time a fruit appeared into fruitCustomer
				
				for (int z = 0; z < count; z++) {
					if (arrayOfHowManyTimesFruitAppeared[z] > 0) {
						fruitCustomer[z] += 1;
					}
				}
												
	}
				
		// All input parsed, so close scanner
				
				scan.close();
				
				for (int y = 0; y < count; y++) {
					if (fruitNumber[y] == 0) {
						
						System.out.println("No customers bought " + menu[y]);
						
					} else {
						
						System.out.println( fruitCustomer[y] + " customers bought " + fruitNumber[y] + " " + menu[y]);
						
					}
				}
}
}



