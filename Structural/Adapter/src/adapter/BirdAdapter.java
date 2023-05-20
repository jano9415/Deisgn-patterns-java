package adapter;

public class BirdAdapter implements ToyBird {

	public Bird bird;
	
	public BirdAdapter(Bird bird) {
		this.bird = bird;
	}
	
	@Override
	public void makeArtificalSound() {
		bird.makeRealSound();
		
	}

	@Override
	public void hunt() {
		bird.hunt();
		
	}


}
