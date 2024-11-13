package unit2;

import java.util.Scanner;

/**
 * Description: This program asks the user 3 questions about triads, and keeps score of how many they get right.
 * Date: Nov. 13, 2024.
 * @author Simon de Gooyer
 */

public class IfChallenge3 {
	
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 //This is for the portfolio

	    /*
	    Write an interactive quiz. It should ask the user three 
	    multiple-choice or true/false questions about something. 
	    It must keep track of how many they get wrong, and print 
	    out a "score" at the end.

	    Sample:

	    Are you ready for a quiz?  N
	    Okay, here it comes!

	    Q1) What is the capital of Alaska?
	      1) Melbourne
	      2) Anchorage
	      3) Juneau

	    > 3

	    That's right!
	    */
		
		//Defining score variable.
		int score = 0;
		
		//Question 1
		System.out.println("Q1) How do you create a minor triad?");
		System.out.println("  1) Lower the fifth degree of the major triad by 1 semitone.");
		System.out.println("  2) Lower the third degree of the major triad by 1 semitone.");
		System.out.println("  3) Raise the third degree of the major triad by 1 semitone.");
		int ans1 = sc.nextInt();
		if (ans1 == 2) {
			System.out.println("That's right.");
			score += 1;
		}
		else {
			System.out.println("That's wrong.");
		}
		
		//Question 2
		System.out.println("Q2) How do you create a diminished triad?");
		System.out.println("  1) Lower the third degree and fifth degree of the minor triad by 1 semitone.");
		System.out.println("  2) Lower the fifth degree of the major triad by 1 semitone.");
		System.out.println("  3) Lower the third degree and fifth degree of the major triad by 1 semitone.");
		int ans2 = sc.nextInt();
		if (ans2 == 3) {
			System.out.println("That's right.");
			score += 1;
		}
		else {
			System.out.println("That's wrong.");
		}
		
		//Question 3
		System.out.println("Q3) How do you create an augmented triad?");
		System.out.println("  1) Raise the fifth degree of the major triad by 1 semitone.");
		System.out.println("  2) Raise the fifth degree of the minor triad by 1 semitone.");
		System.out.println("  3) Raise the third degree of the major triad by 1 semitone.");
		int ans3 = sc.nextInt();
		if (ans3 == 1) {
			System.out.println("That's right.");
			score += 1;
		}
		else {
			System.out.println("That's wrong.");
		}
		
		//Printing final score
		System.out.println("Your final score is " + score + "/3.");
		
		sc.close();

	}

}
