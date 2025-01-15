package unit1;

import java.util.Scanner;

/**
 * Description: This programs the amount of time one has spend alive and asleep.
 * Date: Oct. 10, 2024
 * @author Simon de Gooyer
 */

public class Alive {
	
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int birthYear, birthMonth, birthDay;
		System.out.println("Enter your birth year.");
		birthYear = sc.nextInt();
		System.out.println("Enter your birth month.");
		birthMonth = sc.nextInt();
		System.out.println("Enter your birth day.");
		birthDay = sc.nextInt();
		
		int todayYear, todayMonth, todayDay;
		System.out.println("Enter today's year.");
		todayYear = sc.nextInt();
		System.out.println("Enter today's month");
		todayMonth = sc.nextInt();
		System.out.println("Enter today's day.");
		todayDay = sc.nextInt();
		
		int aliveYear, aliveMonth, aliveDay;
		aliveYear = todayYear - birthYear;
		aliveMonth = todayMonth - birthMonth;
		aliveDay = todayDay - birthDay;
		
		int Alive, Sleep;
		Alive = 365 *(aliveYear) + 30 *(aliveMonth) + aliveDay;
		Sleep = Alive * 8;
		System.out.println("You have been alive for " + Alive + " days.");
		System.out.println("You have been asleep for " + Sleep + " hours.");
		sc.close();
		

	}

}
