package unit1;

/**
 * Description: This is a bunch of String exercises.
 * Date: Oct. 3, 2024
 * @author Simon de Gooyer
 */


public class PlayingWithStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number1 =  13 + "";
		System.out.println(number1);
		
		String fruit = "apple";
		System.out.println(fruit.length());
		
		String name = "Runnymede";
		System.out.println(name.length() + "Ravens".length());
		
		String message = "JackandJillwentupthehill";
		System.out.println(message.substring(message.length() - 4));
		
		System.out.println("hello".substring(3));
		
		System.out.println("hello".substring(5));
		
		String spaces = "    Trim me    ";
		String nospaces = spaces.trim();
		System.out.println(spaces);
		System.out.println(nospaces);
		
		String digits = "1234567890";
		System.out.println(digits.indexOf("6") + digits.indexOf("a"));
		
		System.out.println("Ilovesandwiches".substring(5).length());
		
		String word1 = "Hello";
		String word2 = word1;
		word1 = word1.substring(1, 2);
		System.out.println(word2);
		
		String name1 = "Pierre Elliott Truedeau";
		String name2 = name1.substring(0, 6) + name1.substring(15);
		System.out.println(name2);
		
		String msg = "I am enjoying this class.";
		
		String msg1 = msg.toUpperCase();
		String msg2 = msg.toLowerCase();
		char letter = msg.charAt(6);
		
		System.out.println(msg);
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println("Character at index 6 = " + letter);
		System.out.println("msg has " + msg.length() + " characters.");
	}

}
