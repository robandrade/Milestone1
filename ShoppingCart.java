package app;
import java.util.Scanner;

/** 
 * This class is used for the shopping cart and to show the customer the shopping cart
 * @author rohba
 *
 */
public class ShoppingCart {
	// create variables and initiate the quantity
	private int product;
	private int quantity = 1;
	
	// create the arrays with information in them
	String[] weapons = {"Bat ", "Bow ", "Hand Grenade ", "Hand Gun ", "Assault Rifle "};	
	String[] weaponInfo = {"A wooden weapon for close combat", "A weapon used for shooting arrows", "An explosive weapon thrown by hand", "A firearm usable with only one hand",  "A rapid-fire automatic rifle"};	
	int[] weaponPrice = {20, 100, 500, 1500, 2700};		
	
	/**
	 * This constructor to get the parameter for the product chosen and send to setShoppingCart 
	 * @param product
	 */
	public ShoppingCart(int product) {
		this.setShoppingCart(product);
	}
	
	/**
	 * This setter method initializes the product chosen to the variable product
	 * @param product
	 */
	void setShoppingCart(int product){
		this.product = product;
	}
	
	/**
	 * create method to show the customers shopping cart 
	 */
	void customerShoppingCart(   ) {
		
		
		System.out.println("Your shopping cart:\n");
		
		System.out.println("$"+ weaponPrice[product] + " " +  weapons[product] + "Qty. : " + quantity);
		
		System.out.println("Would you like to cancel your shopping cart?");
		
		Scanner user = new Scanner(System.in);
		
		String answer = user.next();
		
		if (answer.equals("Yes")) {
			System.out.println("There are no items in your shopping cart");
		}
		
		else if (answer.equals("No")) {
			System.out.println("$"+ weaponPrice[product] + " " +  weapons[product] + "Qty. : " + quantity);
		}
				
		System.exit(0);
	}
	
}
