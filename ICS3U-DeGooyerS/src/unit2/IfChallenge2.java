package unit2;

import java.util.Scanner;

/**
 * Description: This is a challenge program for if statements.
 * Date: Nov. 5, 2024
 * @author Simon de Gooyer
 */

public class IfChallenge2 {
	
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 //This is for the portfolio

	    /*Create a program that asks for three numbers.
	    Tell the user if the numbers are strictly in order.
	    ie.  2 5 11 or 5 6 7 are strictly in order.
	    ie.  6 5 7 or 5 5 7 are not
	    */
		System.out.println("Enter an integer");
		int num1 = sc.nextInt();
		System.out.println("Enter another integer");
		int num2 = sc.nextInt();
		System.out.println("Enter a final integer");
		int num3 = sc.nextInt();
		
		if (num1 < num2 && num2 < num3) {
			System.out.println("The numbers "  + num1 + " " + num2 + " " + num3 + " are in order");
		}
		else {
			System.out.println("The numbers "  + num1 + " " + num2 + " " + num3 + " are not in order");
		}
		
		sc.close();
		
	}

}
