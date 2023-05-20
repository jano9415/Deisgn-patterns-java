package abstractfactory;

public class MongoDb implements Database {

	@Override
	public void connect() {
		System.out.println("Connect to Mongo database.");
		
	}

	@Override
	public void select() {
		System.out.println("Select from Mongo database.");
		
	}

	@Override
	public void insert() {
		System.out.println("Insert to Mongo database.");
		
	}

	@Override
	public void delete() {
		System.out.println("Delete Mongo database.");
		
	}

}
