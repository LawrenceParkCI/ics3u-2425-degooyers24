package unit2;

import java.util.Scanner;

/**
 * Description: This program asks the user for a month, and prints the number of days in said month.
 * Date: Nov. 13, 2024
 * @author Simon de Gooyer
 */

public class Switch2 {
	
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    /*Create a program that asks for a month, and print out how many days there are in that month. (For "February", just put 28). This will be a part of your portfolio.

	    Challenge: Ask for the year, and change "February" to 29 if the year is a leap year (divisible by 4)
	    */
		
		//Getting user input.
		System.out.println("Please enter a year.");
		int year = sc.nextInt();
		
		System.out.println("Please enter a month using a number between 1 and 12.");
		int month = sc.nextInt();
		
		//Printing number of days in month.
		switch(month) {
		case 1:
			System.out.println("There are 31 days in January.");
			break;
		case 2:
			if (year % 4 == 0) {
				if (year % 100 == 0) { //If a year is divisible by 100, it is not a leap year unless it is also divisible by 400.
					if (year % 400 == 0) {
						System.out.println("There are 29 days in February this year.");
					}
					else {
						System.out.println("There are 28 days in February this year.");
					}
				}
				else {
					System.out.println("There are 29 days in February this year.");
				}
			}
			else {
				System.out.println("There are 28 days in February this year.");
			}
			break;
		case 3:
			System.out.println("There are 31 days in March");
			break;
		case 4:
			System.out.println("There are 30 days in April.");
			break;
		case 5:
			System.out.println("There are 31 days in May.");
			break;
		case 6:
			System.out.println("There are 30 days in June.");
			break;
		case 7:
			System.out.println("There are 31 days in July.");
			break;
		case 8:
			System.out.println("There are 31 days in August.");
			break;
		case 9:
			System.out.println("There are 30 days in September.");
			break;
		case 10:
			System.out.println("There are 31 days in October.");
			break;
		case 11:
			System.out.println("There are 30 days in November.");
			break;
		case 12:
			System.out.println("There are 31 days in December.");
			break;
		default:
			System.out.println("That is not a month.");
			break;
		}

	    //Can you create it such that you can remove some breaks?
		
		sc.close();

	}

}
