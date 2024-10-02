package unit1;
/**
 * Description: This program takes the user's name from an input in the console, as well as their subject and prints it.
 * Date: Oct. 2, 2024
 * @author Simon de Gooyer
 */

import java.util.Scanner;

public class MakeLabels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String name;
		
		System.out.println("Type in your name and press <Enter>");
		name = sc.nextLine(); // this takes the user's name and converts it into a string variable
		
		String subject;
		
		System.out.println("Type in the subject and press <Enter>");
		subject = sc.nextLine(); // this takes the user's subject and turns it to a string variable
		
		System.out.println();
		System.out.println("******************************");
		System.out.println(name);
		System.out.println(subject);
		System.out.println("******************************");
		// this print the user's name and subject
		sc.close();
		

	}

}
