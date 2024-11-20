package unit2;

import java.util.Scanner;

/**
 * Description: This program takes an input from the user and tests to see if the number is odd or even
 * Date: Nov. 1, 2024
 * @author Simon de Gooyer
 */
public class OddEven {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		//This creates scanner object
		Scanner sc = new Scanner(System.in);
		
		//Taking user input, declaring and setting variable
		System.out.println("Enter a whole number.");
		int number = sc.nextInt();
		
		//If statements decide what to print.
		number = number % 2;
		if(number == 0) {
			System.out.println("That number is even.");
		}
		else {
			System.out.println("That number is odd.");
		}
		sc.close();

	}

}
