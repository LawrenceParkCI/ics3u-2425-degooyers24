package finalProject;

import java.util.Scanner;

/**
 * This is a prototype for my final project, which will be hangman.
 * Date: Jan. 6, 2025
 * @author Simon de Gooyer
 */

public class HangmanPrototype {
	
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a word to be used in the game.");
		String Word = sc.nextLine();
		System.out.println("You entered: " + Word);
		
		System.out.println("Please enter a letter");
		
		System.out.println(" _____      ");
		System.out.println("|     |     ");
		System.out.println("|           ");
		System.out.println("|           ");
		System.out.println("|           ");
		System.out.println("|           ");
		System.out.println("|___________");
		System.out.println();
		System.out.println("_ _ _ _ _ _ _");
		System.out.println();
		System.out.println("Guessed letters: ");
		
		System.out.println(" _____      ");
		System.out.println("|     |     ");
		System.out.println("|     0     ");
		System.out.println("|    /|\\    ");
		System.out.println("|    / \\    ");
		System.out.println("|           ");
		System.out.println("|___________");
		System.out.println();
		System.out.println("_ A N _ M A N");
		System.out.println();
		System.out.println("Guessed letters: E, I, O, P, U");
		System.out.println();
		System.out.println("You have used all your guesses. The hanged man dies and you lose. Better luck next time!");
	}

}
