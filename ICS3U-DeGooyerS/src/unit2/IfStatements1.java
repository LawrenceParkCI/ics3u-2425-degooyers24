package unit2;

/**
 * Description: This is a work program for if statements
 * Date: Nov. 5, 2024
 * @author Simon de Gooyer
 */

public class IfStatements1 {
	
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		int firstNum = 10;
	    int secondNum = 30;

	    System.out.println("Part 1: If");
	    System.out.println("----------");
	    if (firstNum > secondNum) {
	      System.out.println("KEKW");
	      System.out.println("OMEGLUL");
	    }    

	    //What prints out? Why?
	    //Nothing, because firstNum is not greater than secondNum

	    System.out.println("\nPart 2: If, Else");
	    System.out.println("----------------");
	    if (firstNum > secondNum) {
	      System.out.println("KEKW");
	      System.out.println("OMEGALUL");
	    } else {
	      System.out.println("XQCL");
	    }

	    //What prints out? Why?
	    //XQCL, because firstNum isn't greater than secondNum

	    System.out.println("\nPart 3: If, Else if, Else");
	    System.out.println("-------------------------");
	    if (firstNum > secondNum) {
	      System.out.println("KEKW");
	      System.out.println("OMEGALUL");
	    } else if (firstNum % 2 == 0 && secondNum % 3 == 0){
	      System.out.println("sykSHY");
	    } else {
	      System.out.println("XQCL");
	    }

	    //What prints out? Why?
	    //skySHY, because firstNum is divisible by 2 and secondNum is divisible by 3

	    System.out.println("\nPart 4: What's the difference?");
	    System.out.println("------------------------------");
	    System.out.println(1);
	    if (firstNum < secondNum) {
	      System.out.println("KEKW");
	      System.out.println("OMEGALUL");
	    } else if (firstNum % 2 == 0 && secondNum % 3 == 0){
	      System.out.println("sykSHY");
	    } else {
	      System.out.println("XQCL");
	    }

	    System.out.println(2);
	    if (firstNum < secondNum) {
	      System.out.println("KEKW");
	      System.out.println("OMEGALUL");
	    }

	    if (firstNum % 2 == 0 && secondNum % 3 == 0){
	      System.out.println("sykSHY");
	    }

	    if (!(firstNum < secondNum)) {
	      System.out.println("XQCL");
	    }

	    //What prints out? Why?
	    //All statements are true, but the last isn't printed because the exclamation point makes the condition true only if what is in brackets is not true.
	    //What is the difference between the first and second part?
	    //There are no else if or else statements.

	}

}
