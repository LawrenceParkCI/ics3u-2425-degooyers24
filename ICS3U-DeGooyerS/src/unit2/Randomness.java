package unit2;

/**
 * Description: This program generates 10 numbers between 100 and 1000
 * Date: Nov. 18, 2024
 * @author Simon de Gooyer
 */

public class Randomness {
	
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
		      System.out.println(((int)(Math.random()* 901)) +100);
		    }

		    //Run the program a few times. What do you think is the 
		    //range of the numbers generated? between 0 and 1

		    //Read the demo program. Write the code so that the program 
		    //will produce a random number between 100 and 1000.
		    

	}

}
