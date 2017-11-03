import java.util.Scanner;
import java.util.Random;

/* This is a game of rock paper scissors.
 * Rock beats scissors, Paper beats rock, and Scissors beat paper. The same choice will result in a tie and no point will be awarded.
 * The first to 3 points wins. */
class RockPaperScissors {
	
	static TestWinner winner = new TestWinner();
	public static Scanner userInput = new Scanner(System.in);
	public Random randomNum = new Random();
	static int uScore = 0;
	static int cScore = 0;
	
	public static void main(String args[]) {
		
		while(uScore < 3 && cScore < 3) {		// Rounds continue until someone reaches 3 points.
			
			System.out.println("Choose your weapon: rock, paper, or scissors");
			char uChoice = userInput.nextLine().toUpperCase().charAt(0);		// User chooses weapon
			char cChoice = winner.computerChoice();			// Computer chooses weapon
			System.out.println("You: " + uChoice + "\t vs. \tComputer: " + cChoice); //Your choice vs computer's displayed
			String theWinner = winner.testWinner(uChoice, cChoice);
			System.out.println(theWinner);
			addScore(theWinner.charAt(0));
			System.out.println("Your score: " + uScore + " Computer score: " + cScore + "\n");  // Display scores
			
		}
		
		if(uScore == 3) {
			System.out.println("Congratulations, You have beat the game!!!");
		} else {
			System.out.println("GAME OVER!!!");
		}
			
		
	}
	
	public static void addScore(char whoWon) {
		if(whoWon == 'Y') {
			uScore++;
		} else if(whoWon == 'S') {
			cScore++;
		} else {
			System.out.println("Try again next round.");
		}
	}
	
}