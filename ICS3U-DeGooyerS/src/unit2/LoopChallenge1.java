package unit2;

import java.util.Scanner;

/**
 * Description: This program asks the user for the password. If the user is correct, they are welcomed in. If the user is incorrect 3 times, the program will stop.
 * Date: Nov. 25, 2024
 * @author Simon de Gooyer
 */

public class LoopChallenge1 {
	
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */

	public static void main(String[] args) {
		/*
	      Create a program that will ask for the password.  If they answer 
	      incorrectly, tell them, and repeat. If they answer correctly, 
	      welcome them in.
	      
	      Extra: if they don't give a proper answer within 3 
	      Decide on whether you should use the while or do while loop.
	    */
		Scanner sc = new Scanner(System.in);
		String password = "123456789";
		int count = 3;
		int i = 0;
		
		do {
			System.out.println("Please enter the password.");
			String userInput = sc.nextLine();
			
			if (userInput.equals(password)) {
				System.out.println("That password is correct. Welcome.");
				i++;
			}
			else {
				count--;
				System.out.println("That is incorrect. You may try again " + count + " more times.");
			}
		} while (i < 1 && count != 0);
		
		sc.close();

	}

}
