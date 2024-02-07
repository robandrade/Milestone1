package app;
import java.util.Scanner;
/**
 * This class is used to welcome the customer to the store and allow them to see the products or exit
 * 
 * @author rohba
 *
 */
public class StoreFront {

	public static void main(String[] args) {
		
		// Create scanner for user input
		Scanner user = new Scanner(System.in);
		
		// Create object to interact with the customer
		
		System.out.println("Welcome!");
		System.out.println("View the Products: Press 1");
		System.out.println("Exit: Press 2");
		
		int answer = user.nextInt();
		
		if(answer == 1) {
			InventoryManager userM = new InventoryManager(answer);
			
			userM.productToStoreFront();
		}
		
		else if (answer == 2) {
			System.out.println("Goodbye!");
			System.exit(0);
			
		}
		
		// call the salable product to show in the store front
		
		
		// ask user what product will he like to purchase
		
		
	}

}
