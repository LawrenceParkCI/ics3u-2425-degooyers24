package unit2;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    
	    System.out.println("What number day is it?");
	    int day = in.nextInt();

	    switch(day) {
	      case 1:
	        System.out.println("Sunday");
	        break;
	      case 2:
	        System.out.println("Monday");
	        break;
	      case 3:
	        System.out.println("Tuesday");
	        break;
	      case 4:
	        System.out.println("Wednesday");
	        break;
	      case 5:
	        System.out.println("Thursday");
	        break;
	      case 6:
	        System.out.println("Friday");
	        break;
	      case 7:
	        System.out.println("Saturday");
	        break;
	      default:
	        System.out.println("We don't have that day yet");
	        break;
	    }

	    //Run the program. Type in a number between 1-7, and then a number bigger than that. What is the result?
	    //7 == Saturday, 8 == We don't have that day yet.
	    //What do you think default means?
	    //For any result not covered by the cases.
	    //What do you think break means? What happens when you remove a break?
	    //It stops reading code when it reaches a break. Results after the case are printed if a break is removed.


	    //Create another program, this time asking what day it is (String), and printing out how many days until the weekend
	    
	    in.close();

	}

}
