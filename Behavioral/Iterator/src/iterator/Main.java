package iterator;

public class Main {
	
	public static void main(String[] args) {
		
		CarRepository carRepository = new CarRepository();
		
		for(Iterator iterator = carRepository.getIterator(); iterator.hasNext();) {
			String carName = (String) iterator.next();
			System.out.println("Az autó neve: " + carName);
		}
	}

}
