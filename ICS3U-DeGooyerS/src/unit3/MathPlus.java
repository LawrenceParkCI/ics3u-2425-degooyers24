package unit3;

import java.util.Scanner;

/**
 * Description: This program uses various methods to accomplish different tasks
 * Date: Dec. 17, 2024
 * @author Simon de Gooyer
 */

public class MathPlus {
	
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the x coordinate of your first point.");
		int x1 = sc.nextInt();
		
		System.out.println("Please enter the y coordinate of your first point.");
		int y1 = sc.nextInt();
		
		System.out.println("Please enter the x coordinate of your second point.");
		int x2 = sc.nextInt();
		
		System.out.println("Please enter the y coordinate of your second point.");
		int y2 = sc.nextInt();
		
		System.out.println("The distance between these two points is " + distance(x1, y1, x2, y2));
		
		
		
		
		System.out.println("Please enter length of the shortest side of a right triangle.");
		double sideAdjacent = sc.nextDouble();
		
		System.out.println("Please enter the next shortest side of the right triangle.");
		double sideOpposite = sc.nextDouble();
		
		System.out.println("The hypoteneuse of this triangle is " + hypoteneuse(sideAdjacent, sideOpposite));
		
		
		
		System.out.println("Please enter a positive integer.");
		int number = sc.nextInt();
		
		System.out.println("The number of factors for " + number + " is " + numOfFactors(number));
		
		
		
		System.out.println("Please enter a positive integer.");
		int potentialPrime = sc.nextInt();
		
		if (isPrime(potentialPrime) == true) {
			System.out.println(potentialPrime + " is a prime number.");
		}
		else {
			System.out.println(potentialPrime + " is not a prime number.");
		}
		
		sc.close();
	}
	
	/**
	 * This method returns the distance between two points.
	 * @param x1 x value of point 1
	 * @param y1 y value of point 1
	 * @param x2 x value of point 2
	 * @param y2 y value of point 2
	 * @return distance between point 1 and point 2
	 */
	
	public static double distance (int x1, int y1, int x2, int y2) {
		double distance = Math.sqrt(Math.pow(x1 - y1, 2) + Math.pow(x2 - y2, 2));
		return distance;
	}
	
	/**
	 * This method returns the length of a hypoteneuse of a right triangle.
	 * @param num1 first side
	 * @param num2 second side length
	 * @return the length of the hypoteneuse
	 */
	
	public static double hypoteneuse (double num1, double num2) {
		double sideHypoteneuse = Math.pow(num1, 2) + Math.pow(num2, 2);
		sideHypoteneuse = Math.sqrt(sideHypoteneuse);
		return sideHypoteneuse;
	}
	
	/**
	 * This method returns the number of factors of a positive integer.
	 * @param num1 the number whose factors are being counted
	 * @return the number of factors
	 */
	
	public static int numOfFactors (int num1) {
		int factorCount = 0;
		for (int i = 1; i <= num1; ++i) {
			if (num1 % i == 0) {
				factorCount++;
			}
		}
		return factorCount;
	}
	
	/**
	 * This method checks if a number is prime or not
	 * @param num1 the number that is checked for prime status
	 * @return whether or not the number is prime
	 */
	
	public static boolean isPrime (int num1) {
		int factorCount = 0;
		boolean isPrime = true;
		for (int i = 1; i <= num1; ++i) {
			if (num1 % i == 0) {
				factorCount++;
			}
		}
		if (factorCount != 0) {
			isPrime = false;
		}
		return isPrime;
	}
	
	

}
