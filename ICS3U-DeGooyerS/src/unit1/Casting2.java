package unit1;
/**
 * Description: This program is for practicing casting.
 * Date: Oct. 16, 2024
 * @author Simon de Gooyer
 */
public class Casting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
	    Char and int
	    */
	    char myChar = 'a';
	    System.out.println(myChar);
	    System.out.println(myChar + 1);

	    char myChar2 = (char) (myChar + 1);

	    System.out.println(myChar2);

	    //Explain what is happening in the code. Where is there explicit casting, where is there implicit casting?
	    //The implicit casting happens on line 12, the explicit casting happens on line 14
	    
	    //Why do you think this happens?
	    //When you add an integer to a character, because it is a larger data type, it becomes an integer without explicit casting.
	    //Investigate what is ASCII. What is it?
	    //It assigns values to different characters.
	    //Can you find the number value for 'a'? Does it match with your findings above?
	    //The ASCII value for 'a' is 97, matching the above findings.

	    //create a new character myCharCap, and transform myChar into a capital 'A' and print it
	    char myCharCap;
	    myCharCap = (char) (myChar - 32);
	    System.out.println(myCharCap);
	}

}
