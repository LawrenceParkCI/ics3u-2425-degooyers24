package unit1;
/**
 * Description: Unit 1 final assignment
 * Date: Oct. 18, 2024
 * @author Simon de Gooyer
 */

import java.text.NumberFormat;             // Import NumberFormat class
import java.util.Scanner;                  // Import Scanner class
import java.time.LocalDateTime;            // Import Local Date Time class
import java.time.format.DateTimeFormatter; // Import LocalDateTime Formatter class

public class GroceryShopping {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Creating Scanner Object
		LocalDateTime myDateObj = LocalDateTime.now(); //Creating LocalDateTime object and setting to current time.
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); //Creating DateTimeFormatter object.
		String formattedDate = myDateObj.format(myFormatObj); //Creating String containing formatted date.
		
		//Declaring formatting
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		//Declaring Variables
		final double TAX_RATE = 0.13;
		String item1, item2;
		double itemPrice1, itemPrice2, totalPrice1, totalPrice2;
		int itemQuantity1, itemQuantity2;
		
		System.out.println("|| $$$ \\\\\\ ========== \"Simon's Grocery\" ========== /// $$$ ||");
		System.out.println("");
		System.out.println("What would you like to buy?");
		item1 = sc.next();
		System.out.println("What is the price?");
		itemPrice1 = sc.nextDouble();
		System.out.println("How many are you buying?");
		itemQuantity1 = sc.nextInt();
		System.out.println("Thank you.");
		System.out.println("");
		System.out.println("What would you like to buy?");
		item2 = sc.next();
		System.out.println("What is the price?");
		itemPrice2 = sc.nextDouble();
		System.out.println("How many are you buying?");
		itemQuantity2 = sc.nextInt();
		System.out.println("");
		
		totalPrice1 = itemPrice1 * itemQuantity1;
		totalPrice2 = itemPrice2 * itemQuantity2;
		
		System.out.println("          Simon's Grocery");
		System.out.println(formattedDate);
		System.out.println("");
		System.out.println("Item         |  Price    |  Quant.   |  Total Price");
		System.out.println("---------------------------------------------------");
		System.out.printf("%12s | $%8s |%10s | $%11s", item1, itemPrice1, itemQuantity1, totalPrice1);
		System.out.println("");
		System.out.printf("%12s | $%8s |%10s | $%11s", item2, itemPrice2, itemQuantity2, totalPrice2);
		
		
		sc.close();

	}

}
