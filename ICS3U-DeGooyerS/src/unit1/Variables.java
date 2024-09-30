package unit1;
/**
 * Descrition: This program prints the area of a square with sides measuring 25.
 * It also prints my age, and my age in 10 years.
 * Date: Sept. 30, 2024
 * @author Simon de Gooyer
 */
public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int squareSideLength = 25;
		int squareArea = squareSideLength * squareSideLength; 
		System.out.println("The area of a square with sides measuring 25 is " + squareArea);
		
		int myAge = 16;
		System.out.println("My age is " + myAge);
		myAge = myAge + 10;
		System.out.println("My age in 2034 will be " + myAge);

	}

}
