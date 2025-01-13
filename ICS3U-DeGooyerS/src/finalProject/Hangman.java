package finalProject;

import hsa_new.Console;

/**
 * Description: This program is played by two players, with one entering a word, and the other attempting to guess the word, one letter at a time. If the second player makes enough mistakes, they will lose. 
 * Date: Jan. 8, 2025
 * @author Simon de Gooyer
 */

public class Hangman {
	
	static Console c = new Console(25, 100);
	
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		int incorrectGuessCount = 0; //This keeps track of the amount of incorrect guesses made by the user
		boolean isTrue = false;
		boolean gameCompletion = false; 
		int wordCompletion = 0;
		
		c.println("Player 1, please enter a word while Player 2 looks away.");
		String Word = c.readLine();
		c.clear();
		
		String [] incorrectGuesses;
		incorrectGuesses = new String[30];
		
		String [] wordProgress; //This array will show how many of each guessed letter are present in the word. It will use underscores to represent letters that have not been guessed yet.
		wordProgress = new String[Word.length()];
		
		for (int i = 0; i <= Word.length() - 1; i++) { //This loop sets every String in wordProgress to a single underscore
			wordProgress[i] = "_";
		}
		
		printHangman(incorrectGuessCount); //This will print the Hangman illustration. Since no guesses have been made and incorrectGuessCount can only equal 0, it will only print switch case 0.
		
		for (int i = 0; i <= Word.length() - 1; i++) { //This for loop prints out the word, using underscores to represent unrevealed letters, and letters to represent correctly guessed letters.
			c.print(wordProgress[i] + " ");   //At this point, no letters have been guessed, so it only prints out underscores.
		}
		
		boolean duplicateLetterCheck;
		String input; //This will be used to store Player 2's most recent guess.
		
		do {
			do {
				duplicateLetterCheck = false;
				isTrue = false;
				c.println("\nPlayer 2, please enter a letter.");
				input = Character.toString(c.readLine().charAt(0)); 
				
				for (int i = 0; i <= incorrectGuessCount; i++) { //This loop makes sure Player 2 doesn't guess an incorrect letter twice.
					if (input.equalsIgnoreCase(incorrectGuesses[i])) {
						c.println("You have already guessed that letter! Please guess another.");
						duplicateLetterCheck = true;
					}
				}
			} while (duplicateLetterCheck == true);
			
			c.clear();
			
			/*
			 * This takes only first character of the user's input, then converts it back to a string. 
			 * This prevents crashes if the user inputs multiple characters,
			 * and allows the use of the 'equalsIgnoreCase' method.
			 */
			
			for (int i = 0; i <= Word.length() - 1; i++) {
				if (input.equalsIgnoreCase(Character.toString(Word.charAt(i)))) { 
					wordProgress[i] = input;
					c.println(input + " is in the word!");
					wordCompletion++;
					isTrue = true;
				}
			}
			
			if (isTrue == false) { //If input is not in the word, it is added to incorrectGuesses and incorrectGuessCount is increased by 1.
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
		
	}
	
	/**
	 * This method prints the Hangman illustration. Different body parts are shown based on the amount of incorrect guesses made.
	 * @param incorrectGuesses This is used to determine how many body parts of the hanged man to print.
	 */
	
	public static void printHangman (int incorrectGuesses) {
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
