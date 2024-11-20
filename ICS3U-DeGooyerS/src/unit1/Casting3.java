package unit1;

public class Casting3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		    * Strings and Back Again
		    */
		    //Recall:
		    System.out.println("Part 1");
		    System.out.println("1 + 2 + 3" + 4 + 5);
		    //why did it print out this way?
		    //Because you cannot add an integer value to a string value and have it perform addition.

		    //Demonstrate casting a double value to a String in this way
		    //Demonstrate casting a boolean value to a String in this way
		    //Demonstrate casting a char value to a String in this way


		    System.out.println("Part 2");
		    //In order to change a String into an integer, we need another set of code

		    String strNum = "-5";
		    int myNum = Integer.parseInt(strNum);

		    System.out.println(strNum + " x 2 = " + (myNum + myNum));

		    /*Change strNum to the following values, and see if they work:
		     * "25.2" does not work
		     * "23c"  does not work
		     * "2 3"  does not work
		     * "Lol23"does not work
		     * "-5"   does work
		    */
		    //What can you say about how we can use the function, Integer.parseInt()?
		    //It only works with strings that contain only integers. Otherwise it doesn't work.


		    // What do you think the code to change a String to double would look like?
		    // Double.parseDouble();
		    //Similarly, test out the code and write down what instructions
		    String strDouble = "25";
		    double myDouble = Double.parseDouble(strDouble);
		    System.out.println(myDouble);
		  

		    //When do you think it might be necessary to change a string value into an integer value/double value?
		    //Whenever for some reason one has a string but needs an int/double.

	}

}
