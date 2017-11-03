import java.util.Random;

public class TestWinner {
	
	Random randomNum = new Random();
	
	// Decides who won the current round and gives a point to them. 
	public String testWinner(char user, char computer) {
		if(user == 'P' && computer == 'R') {
			return "You have won this round!";
			//uScore++;
		} else if(user == 'R' && computer == 'P') {
			return "Sorry, you have lost this round.";
			//cScore++;
		} else if(user == 'S' && computer == 'P') {
			return "You have won this round!";
			//uScore++;
		} else if(user == 'P' && computer == 'S') {
			return "Sorry, you have lost this round.";
			//cScore++;
		} else if(user == 'R' && computer == 'S') {
			return "You have won this round!";
			//uScore++;
		} else if(user == 'S' && computer == 'R') {
			return "Sorry, you have lost this round.";
			//cScore++;
		} else if(user == computer) {
			return "Waoh, you have tied this round!";
		} else {
			return "Try again";
		}
	}
	
	
	// The computer chooses a 'weapon' based on the range a randomly generated number is in.
	public char computerChoice() {
		char choice;
		int number = randomNum.nextInt(10);
		if(number <= 3) {
			choice = 'R';
		} else if(number <= 6) {
			choice = 'P';
		} else/*(number == randomNum.nextInt(10))*/ {
			choice = 'S';
		}
		return choice;
	}
	
}