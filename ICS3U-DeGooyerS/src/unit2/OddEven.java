package unit2;

import java.util.Scanner;

/**
 * Description: This program takes an input from the user and tests to see if the number is odd or even
 * Date: Nov. 1, 2024
 * @author Simon de Gooyer
 */
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a whole number.");
		int number = sc.nextInt();
		
		number = number % 2;
		if(number == 0) {
			System.out.println("That number is even.");
		}
		else {
			System.out.println("That number is odd.");
		}
		sc.close();

	}

}
