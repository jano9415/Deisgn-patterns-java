package adapter;

public class ToyGoose implements ToyBird {

	@Override
	public void makeArtificalSound() {
		System.out.println("I make artifical goose sound");
		
	}

	@Override
	public void hunt() {
		System.out.println("I can't hunt");
		
	}

}
