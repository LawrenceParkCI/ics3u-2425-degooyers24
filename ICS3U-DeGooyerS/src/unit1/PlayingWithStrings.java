package unit1;

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

	}

}
