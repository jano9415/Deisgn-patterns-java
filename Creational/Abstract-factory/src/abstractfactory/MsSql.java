package abstractfactory;

public class MsSql implements Database {
	
	@Override
	public void connect() {
		System.out.println("Connect to Microsoft Sql database.");
		
	}

	@Override
	public void select() {
		System.out.println("Select from Microsoft Sql database.");
		
	}

	@Override
	public void insert() {
		System.out.println("Insert to Microsoft Sql database.");
		
	}

	@Override
	public void delete() {
		System.out.println("Delete Microsoft Sql database.");

	}

}
