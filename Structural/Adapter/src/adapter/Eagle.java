package adapter;

public class Eagle implements Bird{

	@Override
	public void fly() {
		System.out.println("I can fly");
		
	}

	@Override
	public void makeRealSound() {
		System.out.println("I make eagle sound");
		
	}

	@Override
	public void hunt() {
		System.out.println("I can hunt");
		
	}

}
