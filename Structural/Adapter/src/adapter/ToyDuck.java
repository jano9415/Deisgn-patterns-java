package adapter;

public class ToyDuck implements ToyBird {

	@Override
	public void makeArtificalSound() {
		System.out.println("I make artifical duck sound");
		
	}

	@Override
	public void hunt() {
		System.out.println("I can't hunt");
		
	}

}
