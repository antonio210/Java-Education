package javamasterclass;

public class Methods02 {

	public static void main(String[] args) {


		// return metode može biti ispisan direktno print-om
		System.out.println(calculateScore(true,800,5,100));
	
		
		// return može biti dodjeljen drugoj varijabli
		int highScore=calculateScore(true, 10000, 8, 200);
		System.out.println(highScore);
		
		
		
		
	}
	// metoda više ne ispisuje rezultat nego samo vraća finalScore  
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			return finalScore;
		}
		return -1;
		
	}

}