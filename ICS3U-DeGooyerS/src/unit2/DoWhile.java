package unit2;

import java.util.Scanner;

/**
 * Description: This program is practice with Do-While loops
 * Date: Nov. 21, 2024
 * @author Simon de Gooyer
 */

public class DoWhile {
	
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */

	public static void main(String[] args) {
		 /*
	    A loop is another control structure that allows for repetition. It 
	    does not make a decision on which branch to go on, like the 
	    conditional.
	    It makes a decision whether it should go back to redo a set of code.
	    */
	    Scanner in = new Scanner(System.in);
	    String name;
	    do {
	      System.out.print("What is your name? ");
	      name = in.nextLine();
	    } while (!name.equals("Mr. Lee"));

	    System.out.println("You are welcome into the secret secret pogchamp club.");

	    //Run the code. Explain the code in your own words

	    //What code is repeated? Lines 28 and 29
	    //When does it decide whether to repeat or not? Line 30
	    //What is the condition for repeating? It repeats if name does not equal "Mr. Lee"


	    /*
	     Note:Pay attention to the brackets, and the semicolon
	    */

	    /*
	      When constructing a loop, there are many strategies. I like to 
	      break down the problems this way:
	        1. What commands am I going to repeat?
	        2. How many times/until when will I repeat the code?
	    */

	    //Create a do-while loop that asks for a word, and 
	    //prints it out 20 times.
	    
	    int count = 0;
	    System.out.println("Please enter a word.");
	    String word = in.next();
	    
	    do {
	    	System.out.println(word);
	    	count += 1;
	    } while (count < 20);
	    
	    in.close();

	}

}
