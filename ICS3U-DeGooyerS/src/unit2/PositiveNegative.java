package unit2;

import java.util.Scanner;

/**
 * Description: This program takes an integer from the user then tests if it's positive or negative, then tests if it is divisible by 7.
 * Date: Nov 1, 2024
 * @author Simon de Gooyer
 */
public class PositiveNegative {
	
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		//Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//Taking user input, declaring and setting variable
		System.out.println("Enter an integer.");
		int number = sc.nextInt();
		
		//If statements determine positive or negative
		if (number >= 0) {
			System.out.println("This number is positive.");
		}
		else {
			System.out.println("This number is negative");
		}
		//If statements determine divisibility by 7.
		if (number % 7 == 0) {
			System.out.println("This number is divisible by 7.");
		}
		else {
			System.out.println("This number is not divisible by 7.");
		}
		
		sc.close();

	}

}
