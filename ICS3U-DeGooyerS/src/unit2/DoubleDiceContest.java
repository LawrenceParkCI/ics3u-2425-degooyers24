package unit2;

public class DoubleDiceContest {

	public static void main(String[] args) {
		  /*
		   * Write code that simulates rolling two dice for the user and then two dice for the computer. 
		   * The program should output the total of the two dice for both the user and the computer, 
		   * then announce who won: the computer, the user, or say it was a tie.
		   */
		//Rolling user dice
		int userDie1 = (int)(Math.random()* 6) + 1;
		int userDie2 = (int)(Math.random()* 6) + 1;
		int userTotal = userDie1 + userDie2;
		
		System.out.println("You rolled " + userDie1 + " and " + userDie2 + ", making a total of " + userTotal);
		
		//Rolling computer dice
		int compDie1 = (int)(Math.random()* 6) + 1;
		int compDie2 = (int)(Math.random()* 6) + 1;
		int compTotal = compDie1 + compDie2;
		
		System.out.println("The computer rolled " + compDie1 + " and " + compDie2 + ", making a total of " + compTotal);
		
		//Determining winner
		if (userTotal > compTotal) {
			System.out.println("You won! Congrats!");
		}
		else if (userTotal < compTotal) {
			System.out.println("You lost. Better luck next time.");
		}
		else {
			System.out.println("It's a tie!");
		}

	}

}
