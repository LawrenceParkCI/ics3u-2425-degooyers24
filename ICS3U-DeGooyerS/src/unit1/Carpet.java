package unit1;
/**
 * Description: This program finds the price to carpet a room.
 * Date: Oct. 7, 2024
 * @author Simon de Gooyer
 */

import java.util.Scanner;

public class Carpet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Declaring variables
		double length, width, price, totalPrice;
		
		System.out.println("Input the length of the room and <Enter>");
		length = sc.nextDouble();
		System.out.println("Input the width of the room and <Enter");
		width = sc.nextDouble();
		System.out.println("Input the price per square meter of carpet and <Enter>");
		price = sc.nextDouble();
		
		totalPrice = price * (length * width);
		System.out.println("The total price to carpet this room is " + totalPrice);
		sc.close();

	}

}
