package unit2;

import java.util.Scanner;

/**
 * Description: This program is practice for while loops.
 * Date: Nov. 21, 2024
 * @author Simon de Gooyer
 */

public class While {
	
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    System.out.println("How many people are you planning to see?");

	    //Why do you think I coded it this way?
	    int numPeople = Integer.parseInt(in.nextLine());

	    while (numPeople > 0) {
	      System.out.print("What is this person's name? ");

	      //Why do you think the variable is declared here?
	      String name = in.nextLine();
	      System.out.println("Welcome, " + name + "!");

	      numPeople = numPeople - 1;
	    }
	    
	    //Run the code Using the debugger. 
	    //Explain the code in your own words

	    //What code is repeated? Lines 26 - 32
	    //When does it decide whether to repeat or not? Line 25
	    //What is the condition for repeating? numPeople being greater than 0.


	    //What is the difference between a while loop and a do-while loop?
	    //While loops check the condition at the start of the loop, Do-While guarantees the loop will run at least once by checking at the end of the loop.


	    //Create a while loop that asks for a word, 
	    //and prints it out 20 times.
	    
	    System.out.println("Please enter a word.");
	    String userInput = in.nextLine();
	    int count = 20;
	    
	    
	    while (count > 0) {
	    	System.out.println(userInput);
	    	count -= 1;
	    }
	    
	    in.close();

	}

}
