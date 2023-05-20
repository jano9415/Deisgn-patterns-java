package templatemethod;

public class Basketball extends Game {

	@Override
	void initialize() {
		System.out.println("Pom-pom tánc");
		
	}

	@Override
	void startPlay() {
		System.out.println("Kezdõdobás");
		
	}

	@Override
	void endPlay() {
		System.out.println("Lejár a játékidõ");
		
	}

}
