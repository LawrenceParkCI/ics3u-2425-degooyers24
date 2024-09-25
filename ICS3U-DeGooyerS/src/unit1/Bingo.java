package unit1;
/**
 * Description: This program prints the rules to play bingo and a bingo card to play with. It does not function as actual bingo.
 * Date: Sept. 25, 2024
 * @author Simon de Gooyer
 */

public class Bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BINGO RULES:");
		System.out.println(" ");
		// This prints the instructions to playing bingo.
		System.out.println("1. The caller randomly pulls a numbered bingo ball.");
		System.out.println(" ");
		System.out.println("2. The number is placed on the bingo board and called out.");
		System.out.println(" ");
		System.out.println("3. Players look for the called number on their bingo card.");
		System.out.println(" ");
		System.out.println("4. If the number is located, it is marked off.");
		System.out.println(" ");
		System.out.println("5. Steps 1 to 4 are repeated until a player matches the BINGO pattern");
		System.out.println(" ");
		System.out.println("6. The winning player yells BINGO.");
		System.out.println(" ");
		System.out.println(" ______________________________________________");
		System.out.println("|                                              |");
		// This creates open spaces using format and inputs the letters and numbers onto the Bingo card.
		System.out.printf("|%8s%8s%8s%8s%8s      |", "B", "I", "N", "G", "O");
		System.out.println(" ");
		System.out.println("|                                              |");
		System.out.printf("|%8s%8s%8s%8s%8s      |", "12", "27", "32", "46", "71");
		System.out.println(" ");
		System.out.println("|                                              |");
		System.out.printf("|%8s%8s%8s%8s%8s      |", "3", "17", "41", "54", "68");
		System.out.println(" ");
		System.out.println("|                                              |");
		System.out.printf("|%8s%8s%8s%8s%8s      |", "7", "23", "FREE", "49", "62");
		System.out.println(" ");
		System.out.println("|                                              |");
		System.out.printf("|%8s%8s%8s%8s%8s      |", "5", "30", "37", "59", "66");
		System.out.println(" ");
		System.out.println("|                                              |");
		System.out.printf("|%8s%8s%8s%8s%8s      |", "9", "16", "40", "52", "74");
		System.out.println(" ");
		System.out.println("|______________________________________________|");
	}

}
