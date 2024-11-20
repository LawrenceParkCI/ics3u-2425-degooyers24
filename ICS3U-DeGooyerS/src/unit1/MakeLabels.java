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
		
		// declaring variables
		String name, subject;
		
		// getting user input
		System.out.println("Type in your name and press <Enter>");
		name = sc.nextLine(); 
		
		System.out.println("Type in the subject and press <Enter>");
		subject = sc.nextLine(); 
		
		//printing input
		System.out.println();
		System.out.println("******************************");
		System.out.println(name);
		System.out.println(subject);
		System.out.println("******************************");
		sc.close();
		

	}

}
