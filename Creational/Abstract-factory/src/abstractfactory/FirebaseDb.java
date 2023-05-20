package abstractfactory;

public class FirebaseDb implements Database {
	
	@Override
	public void connect() {
		System.out.println("Connect to Firebase database.");
		
	}

	@Override
	public void select() {
		System.out.println("Select from Firebase database.");
		
	}

	@Override
	public void insert() {
		System.out.println("Insert to Firebase database.");
		
	}

	@Override
	public void delete() {
		System.out.println("Delete Firebase database.");

	}
}
