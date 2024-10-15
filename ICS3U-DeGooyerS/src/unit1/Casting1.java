package unit1;

import java.util.Scanner;

/**
* Description: This is a program to teach casting.
* Date: Oct. 15, 2024
* @author Simon de Gooyer
*/
public class Casting1 {

	public static void main(String[] args) {
		/*
		    *Casting* means to change data from one type to another.

		    Implicit casting - changing of data types without specifically writing extra code

		    Explicit casting - changing of data types by specifically writing extra code
		    */

		    System.out.println("Part 1");

		    int intNum;
		    intNum = 10;

		    double doubleNum;
		    
		    //implicit casting
		    doubleNum = intNum;

		    //What type of data is printed here? Why?
		    //A double is being printed. 
		    System.out.println(doubleNum);

		    //can you explain what is happening in this code?
		    // Variable doubleNum having 2.2 added to its value, but is afterwards changed to an integer, getting rounded down. 
		    doubleNum = doubleNum + 2.2;

		    //explicit casting
		    intNum = (int) doubleNum;

		    //What type of data is printed here? Why?
		    //An integer, because it is printing the value of doubleNum as an integer. 
		    System.out.println(intNum);

		    /*
		    Demonstrate casting between each of the data type. Write down whether it is explicit or implicit
		      int to double implicit
		      double to int explicit
		      int to long   implicit
		      long to int   explicit

		    Why do you think these are implicit/explicit? (Hint: Think about the size of each data and the type of data)]
		    Because implicit casting happens when a smaller data type is casted to a larger data type, and explicit casting happens when a larger data
		    type is casted to a smaller data type.
		    */

		    System.out.println("Part 2");

		    //understanding what you can do with casting, can you round the following variable to the nearest 10th?
		    double myNum;
		    
		    Scanner in = new Scanner(System.in);
		    System.out.println("Give me decimal number up to the hundredth");
		    //code
		    myNum = in.nextDouble();

		    System.out.print("Rounding down to the nearest tenth, it is: ");
		    in.close();
	}

}
