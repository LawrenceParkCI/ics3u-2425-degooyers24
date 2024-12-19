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
		
		System.out.println("Please enter 5 integers, and press <Enter> after each.");
		int[] array1;
		array1 = new int[5];
		array1[0] = sc.nextInt();
		array1[1] = sc.nextInt();
		array1[2] = sc.nextInt();
		array1[3] = sc.nextInt();
		array1[4] = sc.nextInt();
		System.out.println("The sum of these numbers is " + sum(array1));
		
		System.out.println("Please enter 5 doubles, and press <Enter> after each.");
		double[] array2;
		array2 = new double[5];
		array2[0] = sc.nextDouble();
		array2[1] = sc.nextDouble();
		array2[2] = sc.nextDouble();
		array2[3] = sc.nextDouble();
		array2[4] = sc.nextDouble();
		System.out.println("The sum of these numbers is " + sum(array2));
		
		System.out.println("Please enter 5 integers, and press <Enter> after each.");
		int[] array3;
		array3 = new int[5];
		array3[0] = sc.nextInt();
		array3[1] = sc.nextInt();
		array3[2] = sc.nextInt();
		array3[3] = sc.nextInt();
		array3[4] = sc.nextInt();
		System.out.println("The difference between the largest and smallest numbers is " + bigDifference(array3));
		
		System.out.println("Please enter 5 doubles, and press <Enter> after each.");
		double[] array4;
		array4 = new double[5];
		array4[0] = sc.nextDouble();
		array4[1] = sc.nextDouble();
		array4[2] = sc.nextDouble();
		array4[3] = sc.nextDouble();
		array4[4] = sc.nextDouble();
		System.out.println("The difference between the largest and smallest numbers is " + bigDifference(array4));
		
		System.out.println("Please enter an integer.");
		int factoredNumber = sc.nextInt();
		System.out.println("The factors of this number are:");
		int[] factors = factors(factoredNumber);
		for (int i = 0; i < factors.length; i++) {
			System.out.println(factors[i]);
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
		if (factorCount <= 2) {
			isPrime = false;
		}
		return isPrime;
	}
	
	/**
	 * This method returns the sum of the integers in the array it is given
	 * @param array the array containing the numbers
	 * @return the sum of array
	 */
	
	public static int sum (int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}
	
	/**
	 * This method returns the sum of the doubles in the array it is given
	 * @param array the array containing the doubles
	 * @return the sum of array
	 */
	
	public static double sum (double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[1];
		}
		return sum;
	}
	
	public static int min (int[] array) {
		int min = array[0];
		int minIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	/**
	 * This method returns the difference between the max and min ints
	 * @param array the array containing the numbers
	 * @return difference between the largest and smallest numbers
	 */
	
	public static int bigDifference (int[] array) {
		int max = array[0];
		int min = array[0];
		
		int difference;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		
		difference = max - min;
		return difference;
	}
	
	/**
	 * This method returns the difference between max and min doubles
	 * @param array contains numbers to be checked
	 * @return the difference between the max and min value
	 */
	
	public static double bigDifference (double[] array) {
		double max = array[0];
		double min = array[0];
		
		double difference;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		
		difference = max - min;
		return difference;
	}
	
	/**
	 * This method returns an array containing the factors of a number.
	 * @param number the number whose factors are printed
	 * @return the array containing the factors
	 */
	
	public static int[] factors (int number) {
		int factorCount = 0;
		for (int i = 1; i <= number; ++i) {
			if (number % i == 0) {
				factorCount++;
			}
		}
		int[] array;
		int arrayPosition = 0;
		array = new int[factorCount];
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				array[arrayPosition] = i;
				arrayPosition++;
			}
		}
		return array;
	}
	

}
