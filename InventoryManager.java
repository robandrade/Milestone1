package app;
import java.util.Scanner;
/**
 * This class is used for Inventory and the class that shows the customer the products 
 * and allows them to chose a product
 * 
 * @author rohba
 *
 */
public class InventoryManager {
	private int answer;
	private int add;
	
	String[] weapons = {"Bat", "Bow", "Hand Grenade", "Hand Gun", "Assault Rifle"};
	String[] weaponInfo = {"A wooden weapon for close combat", "A weapon used for shooting arrows", "An explosive weapon thrown by hand", "A firearm usable with only one hand",  "A rapid-fire automatic rifle"};
	int[] weaponPrice = {20, 100, 500, 1500, 2700};
	int[] weaponQuantity = {1000, 800, 800, 500, 200};
	
	/**
	 * This constructor gets the answer of the first question, I just use it to create a relationship 
	 * between the store front and the inventory class
	 * @param answer
	 */
	public InventoryManager(int answer) {
		this.answer = answer;
	}

	/**
	 * This method is used to show the products to the customer and allow them to chose a weapon to add 
	 * to the shopping cart
	 */
	void productToStoreFront() {
		
		
		for (int n = 0; n < 5; n++) {
			System.out.println("Press " + n + " for " + weapons[n] + ": " + weaponInfo[n] + ": $"+ weaponPrice[n]);
			
		}
		
		System.out.println("\nWhat would you like to purhcase?");
		
		Scanner userInput = new Scanner(System.in);
		int choice = userInput.nextInt();
		
		ShoppingCart cart = new ShoppingCart(choice);
		
		switch(choice) {
			case 0:
				System.out.println("You've chosen the " + weapons[0]);
				break;
			case 1:
				System.out.println("You've chosen the " + weapons[1]);
				break;
			case 2:
				System.out.println("You've chosen the " + weapons[2]);
				break;
			case 3:
				System.out.println("You've chosen the " + weapons[3]);
				break;
			case 4:
				System.out.println("You've chosen the " + weapons[4]);
				break;
		}
		
		
		System.out.println("\nWould you like to purchase another item? If 'No' it will open the Shopping Cart");
		
		String anotherItem = userInput.next();
		
		if (anotherItem.equals("Yes")) {
			productToStoreFront();
		}
		else if(anotherItem.equals("No")) {
			cart.customerShoppingCart();
		}
		
		
		
	}
	

}
