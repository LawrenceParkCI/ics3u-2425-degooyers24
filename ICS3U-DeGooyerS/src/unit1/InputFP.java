package unit1;
/**
 * Description: This program takes 2 floating point numbers and prints them.
 * Date: Oct. 2, 2024
 * @author Simon de Gooyer
 */

import java.util.Scanner;

public class InputFP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// declaring variables
		double num1, num2;
		
		// getting user input
		System.out.println("Enter a floating point number and <Enter>");
		num1 = sc.nextDouble();
		
		System.out.println("Enter one more floating point number and <Enter>");
		num2 = sc.nextDouble();
		
		// printing numbers
		System.out.println();
		System.out.println("The first number was " + num1);
		System.out.println("The second number was " + num2);
		

	}

}
