package adapter;

public class BusAdapter implements Vehicle {
	
	private Bus bus;
	
	public BusAdapter() {

	}
	
	public BusAdapter(Bus bus) {
		this.bus = bus;
	}

	@Override
	public String getName() {

		return this.bus.getName();
	}

	@Override
	public int getSpeed() {

		return this.bus.getMaxSpeed();
	}

	@Override
	public int getWheels() {

		return this.bus.getWheels();
	}

}
