package unit2;

import java.util.Scanner;

/**
 * Description: This program asks for a name and prints it on different lines.
 * Date: Nov. 26, 2024
 * @author Simon de Gooyer
 */

public class StringLengthAndChars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
	      Goal: Using string methods with a for loop
	        .length()
	        .charAt(<position>)
	    */
	    
	    String name = "Ms. Kemp";

	    //write comments for the following code - what does it print out, and why?
	    System.out.println(name.length());
	    System.out.println(name.charAt(1));
	    System.out.println(name.charAt(2));
	    System.out.println(name.charAt(3));
	  
	    //.length() gets the length 
	    //.charAt(position) gets the character at the index in brackets
	        //counting starts at 1, but index starts at 0

	    /**
	      Ask for user input for name. Print out each individual letter of the name on separate lines, using a for loop
	    */
	    System.out.println("Please enter your name.");
	    String username = sc.nextLine();
	    int nameIndex = 0;
	    
	    for (int i = 0; i < username.length(); i++) {
	    	System.out.println(username.charAt(nameIndex));
	    	nameIndex++;
	    }

	}

}
