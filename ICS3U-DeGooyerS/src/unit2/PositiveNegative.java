package unit2;

import java.util.Scanner;

/**
 * Description: This program takes an integer from the user then tests if it's positive or negative, then tests if it is divisible by 7.
 * Date: Nov 1, 2024
 * @author Simon de Gooyer
 */
public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer.");
		int number = sc.nextInt();
		
		if (number >= 0) {
			System.out.println("This number is positive.");
		}
		else {
			System.out.println("This number is negative");
		}
		number = number % 7;
		if (number == 0) {
			System.out.println("This number is divisible by 7.");
		}
		else {
			System.out.println("This number is not divisible by 7.");
		}
		
		sc.close();

	}

}
