package adapter;

public class Bicycle implements Vehicle {
	
	private String name;
	private int speed;
	private int wheels;
	
	public Bicycle() {
		
	}

	public Bicycle(String name, int speed, int wheels) {
		super();
		this.name = name;
		this.speed = speed;
		this.wheels = wheels;
	}


	@Override
	public String getName() {

		return name;
	}

	@Override
	public int getSpeed() {

		return speed;
	}

	@Override
	public int getWheels() {

		return wheels;
	}
	

}
