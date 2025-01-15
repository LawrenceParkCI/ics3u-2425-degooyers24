package unit1;

public class MathOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("1 + 2 + 3 + 4 + 5");
	      
	    System.out.println(1 + 2 + 3 + 4 + 5);
	      
	    System.out.println(1 + 2 + "3 + 4 + 5");
	      
	    System.out.println("1 + 2 + 3" + 4 + 5);
	    /*
	     * The last two lines print differently because 
	     * The third line adds 1 and 2 together before 
	     * adding that number to the string that is being
	     * printed. The fourth line adds four to the 
	     * string that is being printed, then adds five
	     * to the string. 
	     */
	    
	    /*
	     * The + operator can be used to perform simple addition, 
	     * but it can also add variables, integers and floating 
	     * points to strings without performing addition.
	     */
	    
	    double celsiusToFahrenheit = 45 * 1.8 + 32;
	    
	    System.out.println("45 degrees celsius is " + celsiusToFahrenheit + " degrees in fahrenheit.");
	    
	    double fahrenheitToCelsius = 900 * 0.556 - 17.778;
	    
	    System.out.println("900 degrees fahrenheit is approximateley " + fahrenheitToCelsius + " degrees in celsius.");
	    // It is impossible to acquire an exact conversion as there are too many decimal places in the conversion rate.
	    
	    System.out.println("I think the % operator, also known as mod, or modulus, performs division with integers, but only gives the remainder.");
	    
	    int modTest = 11 % 2;
	    
	    System.out.println("The remainder of 11 / 2 is " + modTest);
	}

}
