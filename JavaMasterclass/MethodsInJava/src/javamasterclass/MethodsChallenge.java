package javamasterclass;

public class MethodsChallenge {

//	Create a method called diplayHighPosition
//	it should take player's name as parameter, and 2nd parameter as a position in the high score table
//	You should display players name along with a message like " managed to get into position " and the 
//	position and further message " on the high score table"
	
//	create 2nd method called calculateHighScorePosition
//	it should ask for one argument only, the player's score
//	it should return an int
//	data return should be
//	1 if the score is >1000
//	2 if the score is >500 and <1000
//	3 if the score is >100 and <500
//	4 for all other cases
//	call both methods and display the results of the following
//	a score of 1500, 900, 400 and 50
	
	public static void main(String[] args) {
		
		displayHighPosition("Marko", calculateHighScorePosition(50));
		displayHighPosition("Ivan", calculateHighScorePosition(400));
		displayHighPosition("Josip", calculateHighScorePosition(900));
		displayHighPosition("Hrvoje", calculateHighScorePosition(1500));
	}
	
	public static int calculateHighScorePosition(int score) {
		
		if(score>=1000) {
			return 1;
		}
		else if(score>=500) {
			return 2;
		}
		else if(score>=100) {
			return 3;
		}
		return 4;
		
	}
	
	public static void displayHighPosition(String name, int position) {
		System.out.println("Player "+name+" managed to get into position #"+position+" on the high score table");
	}
	
	
	
	
	
	
	
	
	
	
}
