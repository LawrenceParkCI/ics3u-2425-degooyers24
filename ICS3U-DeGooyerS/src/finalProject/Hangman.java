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
		int num1 = 0;
		boolean gameCompletion = false;
		
		System.out.println("Player 1, please enter a word while Player 2 looks away.");
		String Word = sc.next();
		System.out.println(Word.length());
		
		String [] incorrectGuesses;
		incorrectGuesses = new String[30];
		
		String [] wordProgress;
		wordProgress = new String[Word.length()];
		
		for (int i = 0; i <= Word.length() - 1; i++) {
			wordProgress[i] = "_";
		}
		
		do {
			System.out.println("Player 2, please enter a letter.");
			String input  = Character.toString(sc.next().charAt(0));	
			
			for (int i = 0; i <= Word.length() - 1; i++) {
				if (input.equalsIgnoreCase(Character.toString(Word.charAt(i)))) {
					wordProgress[i] = input;
					num1++;
				}
			}
			
			if (num1 == 0) {
				incorrectGuesses[incorrectGuessCount] = input;
				incorrectGuessCount++;
			}
			
			printHangman(incorrectGuessCount);
			
			for (int i = 0; i <= Word.length() - 1; i++) {
				System.out.print(wordProgress[i] + " ");
			}
		} while (gameCompletion == false);
		
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
			System.out.println("|___________ \n");
			break;
			
		case 1:
			System.out.println(" _____      ");
			System.out.println("|     |     ");
			System.out.println("|           ");
			System.out.println("|           ");
			System.out.println("|           ");
			System.out.println("|    /      ");
			System.out.println("|   /       ");
			System.out.println("|           ");
			System.out.println("|___________ \n");
			break;
			
		case 2:
			System.out.println(" _____      ");
			System.out.println("|     |     ");
			System.out.println("|           ");
			System.out.println("|           ");
			System.out.println("|           ");
			System.out.println("|    / \\   ");
			System.out.println("|   /   \\  ");
			System.out.println("|           ");
			System.out.println("|___________ \n");
			break;
			
		case 3:
			System.out.println(" _____      ");
			System.out.println("|     |     ");
			System.out.println("|           ");
			System.out.println("|     |     ");
			System.out.println("|     |     ");
			System.out.println("|    / \\   ");
			System.out.println("|   /   \\  ");
			System.out.println("|           ");
			System.out.println("|___________ \n");
			break;
			
		case 4:
			System.out.println(" _____      ");
			System.out.println("|     |     ");
			System.out.println("|           ");
			System.out.println("|    /|     ");
			System.out.println("|   / |     ");
			System.out.println("|    / \\   ");
			System.out.println("|   /   \\  ");
			System.out.println("|           ");
			System.out.println("|___________ \n");
			break;
			
		case 5:
			System.out.println(" _____      ");
			System.out.println("|     |     ");
			System.out.println("|           ");
			System.out.println("|    /|\\   ");
			System.out.println("|   / | \\  ");
			System.out.println("|    / \\   ");
			System.out.println("|   /   \\  ");
			System.out.println("|           ");
			System.out.println("|___________ \n");
			break;
		case 6:
			System.out.println(" _____      ");
			System.out.println("|     |     ");
			System.out.println("|     0     ");
			System.out.println("|    /|\\   ");
			System.out.println("|   / | \\  ");
			System.out.println("|    / \\   ");
			System.out.println("|   /   \\  ");
			System.out.println("|           ");
			System.out.println("|___________ \n");
			System.out.println();
			System.out.println("You have used all your guesses. The hanged man dies and you lose. Better luck next time!");
		}
	}

}
