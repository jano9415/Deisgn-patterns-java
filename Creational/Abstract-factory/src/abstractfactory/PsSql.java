package abstractfactory;

public class PsSql implements Database {
	
	@Override
	public void connect() {
		System.out.println("Connect to Postgre Sql database.");
		
	}

	@Override
	public void select() {
		System.out.println("Select from Postgre Sql database.");
		
	}

	@Override
	public void insert() {
		System.out.println("Insert to Postgre Sql database.");
		
	}

	@Override
	public void delete() {
		System.out.println("Delete Postgre Sql database.");

	}

}
