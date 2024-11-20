package unit2;

import java.util.Scanner;

/**
 * Description: This program will ask the user for their name. 70% of the time it will say this name is their favorite, 30% of the time it will say it hates that name.
 * Date: Nov. 19, 2024
 * @author Simon de Gooyer
 */

public class NameGame {
	
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * The application should prompt the user for their name. 
		 * 70% of the time the program should output that the user's name is their favourite, 
		 * and 30% of the time says they hate that name.
		 */
		
		System.out.println("What's your name?");
		String userName = sc.nextLine();
		int number = (int)(Math.random() * 10) + 1;
		
		if (number > 3) {
			System.out.println(userName + " is my favorite name!");
		}
		else {
			System.out.println(userName + " is a terrible name. I hate that name.");
		}
		
		sc.close();

	}

}
