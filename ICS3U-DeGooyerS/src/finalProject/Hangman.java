package finalProject;

import java.util.Scanner;

import hsa_new.Console;

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
		
		Console c = new Console(25, 100);
		
		int incorrectGuessCount = 0; //This keeps track of the amount of incorrect guesses made by the user
		boolean isTrue = false;
		boolean gameCompletion = false; 
		int wordCompletion = 0;
		
		c.println("Player 1, please enter a word while Player 2 looks away.");
		String Word = c.readLine();
		
		String [] incorrectGuesses;
		incorrectGuesses = new String[30];
		
		String [] wordProgress;
		wordProgress = new String[Word.length()];
		
		for (int i = 0; i <= Word.length() - 1; i++) {
			wordProgress[i] = "_";
		}
		
		printHangman(incorrectGuessCount);
		for (int i = 0; i <= Word.length() - 1; i++) { //This for loop prints out the word, using underscores to represent unrevealed letters, and letters to represent correctly guessed letters.
			c.print(wordProgress[i] + " ");   //At this point, no letters have been guessed, so it only prints out underscores.
		}
		
		do {
			isTrue = false;
			c.println("\nPlayer 2, please enter a letter.");
			String input  = Character.toString(c.readLine().charAt(0)); 
			
			/*
			 * This takes only first character of the user's input, then converts it back to a string. 
			 * This prevents crashes if the user inputs multiple characters,
			 * and allows the use of the 'equalsIgnoreCase' method.
			 */
			
			for (int i = 0; i <= Word.length() - 1; i++) {
				if (input.equalsIgnoreCase(Character.toString(Word.charAt(i)))) { 
					wordProgress[i] = input;
					wordCompletion++;
					isTrue = true;
				}
			}
			
			if (isTrue == false) { //
				incorrectGuesses[incorrectGuessCount] = input;
				incorrectGuessCount++;
				c.println("Sorry, " + input + " is not in the word.\n");
			}
			
			printHangman(incorrectGuessCount); //While only used once, a separate method is used here to make the program more readable.
			
			for (int i = 0; i <= Word.length() - 1; i++) { //This for loop prints out the word, using underscores to represent unrevealed letters, and letters to represent correctly guessed letters.
				c.print(wordProgress[i] + " ");
			}
			
			c.print("\nIncorrect letters: ");
			for (int i = 0; i <= incorrectGuessCount - 1; i++) { //This for loop prints out a list of previously guessed incorrect letters.
				c.print(incorrectGuesses[i] + ", ");
			}
			
			c.println("");
			
			if (wordCompletion == Word.length()) { //This checks after every guess if the user has completed the word. 
				gameCompletion = true;
				c.println("You guessed the word! You win!");
			}
			else if (incorrectGuessCount == 6) { //This checks after every guess if the user has guessed incorrectly enough times to lose.
				c.println("You have used all your guesses. The hanged man dies and you lose. Better luck next time! The word was : " + Word);
				gameCompletion = true;
				}
			
		} while (gameCompletion == false);
		
		sc.close();

	}
	
	/**
	 * This method prints the Hangman illustration, the user's guessed letters, and progress made on the correct word.
	 * @param incorrectGuesses This is used to determine how many body parts of the hanged man to print.
	 */
	
	public static void printHangman (int incorrectGuesses) {
		Console c = new Console(25, 50);
		c.clear();
		switch(incorrectGuesses) {
		case 0:
			c.println(" _____      ");
			c.println("|     |     ");
			c.println("|           ");
			c.println("|           ");
			c.println("|           ");
			c.println("|           ");
			c.println("|           ");
			c.println("|           ");
			c.println("|___________ \n");
			break;
			
		case 1:
			c.println(" _____      ");
			c.println("|     |     ");
			c.println("|           ");
			c.println("|           ");
			c.println("|           ");
			c.println("|    /      ");
			c.println("|   /       ");
			c.println("|           ");
			c.println("|___________ \n");
			break;
			
		case 2:
			c.println(" _____      ");
			c.println("|     |     ");
			c.println("|           ");
			c.println("|           ");
			c.println("|           ");
			c.println("|    / \\   ");
			c.println("|   /   \\  ");
			c.println("|           ");
			c.println("|___________ \n");
			break;
			
		case 3:
			c.println(" _____      ");
			c.println("|     |     ");
			c.println("|           ");
			c.println("|     |     ");
			c.println("|     |     ");
			c.println("|    / \\   ");
			c.println("|   /   \\  ");
			c.println("|           ");
			c.println("|___________ \n");
			break;
			
		case 4:
			c.println(" _____      ");
			c.println("|     |     ");
			c.println("|           ");
			c.println("|    /|     ");
			c.println("|   / |     ");
			c.println("|    / \\   ");
			c.println("|   /   \\  ");
			c.println("|           ");
			c.println("|___________ \n");
			break;
			
		case 5:
			c.println(" _____      ");
			c.println("|     |     ");
			c.println("|           ");
			c.println("|    /|\\   ");
			c.println("|   / | \\  ");
			c.println("|    / \\   ");
			c.println("|   /   \\  ");
			c.println("|           ");
			c.println("|___________ \n");
			break;
		case 6:
			c.println(" _____      ");
			c.println("|     |     ");
			c.println("|     0     ");
			c.println("|    /|\\   ");
			c.println("|   / | \\  ");
			c.println("|    / \\   ");
			c.println("|   /   \\  ");
			c.println("|           ");
			c.println("|___________ \n");
		}
	}

}
