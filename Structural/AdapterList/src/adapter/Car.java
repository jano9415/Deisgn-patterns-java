package adapter;

public class Car implements Vehicle {
	
	private String name;
	private int speed;
	private int wheels;
	
	public Car() {
		
	}

	public Car(String name, int speed, int wheels) {
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
