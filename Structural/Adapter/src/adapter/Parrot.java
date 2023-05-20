package adapter;

public class Parrot implements Bird {

	@Override
	public void fly() {
		System.out.println("I can fly");
		
	}

	@Override
	public void makeRealSound() {
		System.out.println("I make parrot sound");
		
	}

	@Override
	public void hunt() {
		System.out.println("I can't hunt");
		
	}

}
