package unit2;

/**
 * Description: this is a work program for booleans
 * Date: Nov. 4, 2024
 * @author Simon de Gooyer
 */

public class BasicBoolean {
	
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //we've declared a variable called isPurple of boolean type
	    //Recall: boolean holds either true or false
	    boolean isPurple = false;
	    System.out.println(isPurple);


	    /*
	      Boolean Operators, Expressions
	    */

	    //boolean expressions are ways we can "calculate" whether
	    //something is true or false

	    int firstNum = 5;
	    int secondNum = 10;
	    double thirdNum = 5.5;

	    //this prints out true because secondNum is greater than firstNum
	    System.out.println("1: " + (firstNum < secondNum)); 

	    //this prints out False because firstNum is not greater than secondNum
	    System.out.println("2: " + (firstNum > secondNum)); 

	    //this prints out true because thirdNum converted to an integer is equal to firstNum
	    System.out.println("3: " + (firstNum <= (int)thirdNum)); 
	    //this prints out true because thirdNum is greater than firstNum
	    System.out.println("4: " + (firstNum <= thirdNum)); 

	    /*Test out these boolean operators. Figure out the meaning
	      * > means: greater than
	      * < means: lesser than
	      * <= means: lesser than or equal to
	      * >= means: greater than or equal to
	      * == means: equal
	      * != means: not equal
	    */

	}

}
