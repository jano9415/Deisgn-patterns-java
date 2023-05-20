package abstractfactory;

public interface Database {
	
	//Néhány példa függvény, amit el tud végezni az adott adatbázis objektum
	void connect();
	void select();
	void insert();
	void delete();

}
