package unit1; 
/**
 * Description: This program manipulates a string that the user inputs.
 * Date: Oct. 7, 2024
 * @author Simon de Gooyer
 */

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Declaring variables
		String sentence;
		System.out.println("Print a sentence and <Enter>");
		sentence = sc.nextLine();
		
		// Manipulation and printing of sentence
		System.out.println(sentence);
		String sentenceUpper = sentence.toUpperCase();
		System.out.println(sentenceUpper);
		String sentenceLower = sentence.toLowerCase();
		System.out.println(sentenceLower);
		int sentenceLength = sentence.length();
		System.out.println(sentenceLength);
		char characterIndex5 = sentence.charAt(5);
		System.out.println(characterIndex5);
		sc.close();

	}

}
