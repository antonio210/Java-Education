package javamasterclass;

public class Methods01 {

	public static void main(String[] args) {


		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		/* ***section replaced with method***
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score was " + finalScore);
		}*/
		
		calculateScore(gameOver,score,levelCompleted,bonus); // metoda koristi variable koje smo zadali gore 

		/*
		score = 10000;
		levelCompleted = 8;
		bonus = 200;

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}
*/
		
		calculateScore(true, 10000, 8, 200); // vrijednosti direktno une�ene u metodu
		
	}

	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score was " + finalScore);
		}
		
	}

}
