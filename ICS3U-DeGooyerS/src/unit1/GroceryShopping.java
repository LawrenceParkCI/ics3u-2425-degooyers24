package unit1;
/**
 * Description: Unit 1 final assignment
 * Date: Oct. 18, 2024
 * @author Simon de Gooyer
 */

import java.text.NumberFormat;// Import NumberFormat class
import java.util.Scanner;// Import Scanner class
import java.time.LocalDateTime; // Import Local Date Time class
import java.time.format.DateTimeFormatter; // Import LocalDateTime Formatter class

public class GroceryShopping {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Creating Scanner Object
		LocalDateTime myDateObj = LocalDateTime.now(); //Creating LocalDateTime object and setting to current time.
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); //Creating DateTimeFormatter object.
		String formattedDate = myDateObj.format(myFormatObj); //Creating String containing formatted date.
		
		//Used for formatting
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		//Declaring variables
		final double TAX_RATE = 0.13;
		String item1, item2;
		double itemPrice1, itemPrice2, totalPrice1, totalPrice2, subtotal, total, tax;
		int itemQuantity1, itemQuantity2;
		
		System.out.println("|| $$$ \\\\\\ ========== \"Simon's Grocery\" ========== /// $$$ ||");
		System.out.println("");
		//Taking user input
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
		
		//Determining the value of variables
		totalPrice1 = itemPrice1 * itemQuantity1;
		totalPrice2 = itemPrice2 * itemQuantity2;
		subtotal = totalPrice1 + totalPrice2;
		total = subtotal + (subtotal * TAX_RATE);
		tax = subtotal * TAX_RATE;
		
		//Print receipt 
		System.out.println("This is your receipt:");
		System.out.println("");
		System.out.println("          Simon's Grocery");
		System.out.println(formattedDate);
		System.out.println("");
		System.out.println("Item         |  Price    |  Quant.   |  Total Price");
		System.out.println("---------------------------------------------------");
		System.out.printf("%-12s | %9s |%10s | %12s", item1, money.format(itemPrice1), itemQuantity1, money.format(totalPrice1));
		System.out.println("");
		System.out.printf("%-12s | %9s |%10s | %12s", item2, money.format(itemPrice2), itemQuantity2, money.format(totalPrice2));
		System.out.println("");
		System.out.println("---------------------------------------------------");
		System.out.printf("                          %8s: %8s", "Subtotal", money.format(subtotal));
		System.out.println("");
		System.out.printf("                          %8s: %8s", "Tax", money.format(tax));
		System.out.println("");
		System.out.printf("                          %8s: %8s", "Total", money.format(total));
		System.out.println("");
		System.out.println("");
		
		System.out.print("This is approximately $" + Math.rint(total));
		
		total = total * 20; //Rounding to the nearest 5 cents.
		total = Math.rint(total);
		total = total / 20;
		
		System.out.print(" or " + money.format(total));
		System.out.println("");
		
		System.out.println("Thank you for shopping at Simon's Grocery!");
		System.out.println("Have a great day!");
		
		
		sc.close();

	}

}
