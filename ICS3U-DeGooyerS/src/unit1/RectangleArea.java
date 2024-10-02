package unit1;
/**
 * Description: This program takes user input of length and width and multiplies them to find the area
 * Date: Oct. 2, 2024
 * @author Simon de Gooyer
 */

import java.util.Scanner; 

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//declare variables
		int length, width, depth;
		
		// get user input
		System.out.println("VOLUME PROGRAM");
		System.out.println("Type in the length of the rectangle and <Enter>: ");
		length = sc.nextInt();
		
		System.out.println("Type in the width of the rectangle and <Enter>");
		width = sc.nextInt();
		
		System.out.println("Type in the depth of the rectangular prism and <Enter>");
		depth = sc.nextInt();
		
		// calculate the volume
		int volume = length * width;
		
		//print the output
		System.out.println("The area of your rectangle is " + volume);
		sc.close();

	}

}
