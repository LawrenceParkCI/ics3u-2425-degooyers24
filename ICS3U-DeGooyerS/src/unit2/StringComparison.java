package unit2;

import java.util.Scanner;

/**
 * Description: This program teaches string comparison
 * Date: Nov. 12, 2024
 * @author Simon de Gooyer
 */

public class StringComparison {
	
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    String answer;

	    System.out.println("What is the capital of Ontario?");
	    answer = in.nextLine();

	    if (answer == "Toronto") {
	      System.out.println("Correct!");
	    } else {
	      System.out.println("Sorry, that's incorrect.");
	    }
	    
	    //Run the code. What happens when you type the correct answer? The incorrect answer?
	    //Both return incorrect answers.

	    /*
	      Strings are objects, not primitives and as such are a 
	      *reference* data type. These variables hold an address 
	      to the value. (Scanner is also a reference data type)

	      int, double, char, etc. are all *primitive* data types. 
	      These variables hold the actual value.

	      Look at the website:
	      https://www.javatpoint.com/string-comparison-in-java

	      Demonstrate the use of the functions:
	        .compareTo()
	        .equals()
	        .equalsIgnoreCase()
	    */

	    //What values does compareTo() return? How can we 
	    //interpret the value?
	    //compareTo() returns a 0, 1, or -1 if the strings it is comparing are equal, string 1 is 
	    //greater than string 2, or string 2 is greater than string 1, respectively.

	    //what value does equals() and equalsIgnoreCase() return? 
	    //They return true values or false values
	    //What is the difference between these two functions?
	    //equalsIgnoreCase() works even if letters aren't the same case, equals() doesn't.
	    
	    String test1 = "Toronto";
	    System.out.println(test1.equalsIgnoreCase(answer));
	    
	    String test2 = "Toronto";
	    System.out.println(test2.equals(answer));
	    
	    in.close();

	}

}
