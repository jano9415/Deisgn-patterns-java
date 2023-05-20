package templatemethod;

public class Football extends Game {

	@Override
	void initialize() {
		System.out.println("A focimeccsen eléneklik a himnuszt.");
		
	}

	@Override
	void startPlay() {
		System.out.println("Kezdõrúgás");
		
	}

	@Override
	void endPlay() {
		System.out.println("A bíró lefújja a meccset aztán vége vagy tizenegyes");
		
	}

}
