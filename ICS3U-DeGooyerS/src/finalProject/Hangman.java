package finalProject;

import java.util.Scanner;

/**
 * Description: This program is played by two players, with one entering a word, and the other attempting to guess the word, one letter at a time. If the second player makes enough mistakes, they will lose. 
 * Date: Jan. 8, 2025
 * @author Simon de Gooyer
 */

public class Hangman {
	
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int incorrectGuessCount = 0;
		
		sc.close();

	}
	
	/**
	 * This method prints the Hangman illustration, the user's guessed letters, and progress made on the correct word.
	 * @param incorrectGuesses This is used to determine how many body parts of the hanged man to print.
	 */
	
	public static void printHangman (int incorrectGuesses) {
		switch(incorrectGuesses) {
		case 0:
			System.out.println(" _____      ");
			System.out.println("|     |     ");
			System.out.println("|           ");
			System.out.println("|           ");
			System.out.println("|           ");
			System.out.println("|           ");
			System.out.println("|           ");
			System.out.println("|           ");
			System.out.println("|___________");
			System.out.println();
			System.out.println("_ _ _ _ _ _ _");
			System.out.println();
			System.out.println("Guessed letters: ");
			
		case 1:
			System.out.println(" _____      ");
			System.out.println("|     |     ");
			System.out.println("|           ");
			System.out.println("|           ");
			System.out.println("|           ");
			System.out.println("|    /      ");
			System.out.println("|   /       ");
			System.out.println("|           ");
			System.out.println("|___________");
			System.out.println();
			System.out.println("_ _ _ _ _ _ _");
			System.out.println();
			System.out.println("Guessed letters: ");
			
		case 2:
			System.out.println(" _____      ");
			System.out.println("|     |     ");
			System.out.println("|           ");
			System.out.println("|           ");
			System.out.println("|           ");
			System.out.println("|    / \\   ");
			System.out.println("|   /   \\  ");
			System.out.println("|           ");
			System.out.println("|___________");
			System.out.println();
			System.out.println("_ _ _ _ _ _ _");
			System.out.println();
			System.out.println("Guessed letters: ");
			
		case 3:
			System.out.println(" _____      ");
			System.out.println("|     |     ");
			System.out.println("|           ");
			System.out.println("|     |     ");
			System.out.println("|     |     ");
			System.out.println("|    / \\   ");
			System.out.println("|   /   \\  ");
			System.out.println("|           ");
			System.out.println("|___________");
			System.out.println();
			System.out.println("_ _ _ _ _ _ _");
			System.out.println();
			System.out.println("Guessed letters: ");
			
		case 4:
			System.out.println(" _____      ");
			System.out.println("|     |     ");
			System.out.println("|           ");
			System.out.println("|    /|     ");
			System.out.println("|   / |     ");
			System.out.println("|    / \\   ");
			System.out.println("|   /   \\  ");
			System.out.println("|           ");
			System.out.println("|___________");
			System.out.println();
			System.out.println("_ _ _ _ _ _ _");
			System.out.println();
			System.out.println("Guessed letters: ");
			
		case 5:
			System.out.println(" _____      ");
			System.out.println("|     |     ");
			System.out.println("|           ");
			System.out.println("|    /|\\   ");
			System.out.println("|   / | \\  ");
			System.out.println("|    / \\   ");
			System.out.println("|   /   \\  ");
			System.out.println("|           ");
			System.out.println("|___________");
			System.out.println();
			System.out.println("_ _ _ _ _ _ _");
			System.out.println();
			System.out.println("Guessed letters: ");
			
		case 6:
			System.out.println(" _____      ");
			System.out.println("|     |     ");
			System.out.println("|     0     ");
			System.out.println("|    /|\\   ");
			System.out.println("|   / | \\  ");
			System.out.println("|    / \\   ");
			System.out.println("|   /   \\  ");
			System.out.println("|           ");
			System.out.println("|___________");
			System.out.println();
			System.out.println("_ _ _ _ _ _ _");
			System.out.println();
			System.out.println("Guessed letters: ");
			System.out.println();
			System.out.println("You have used all your guesses. The hanged man dies and you lose. Better luck next time!");
		}
	}

}
