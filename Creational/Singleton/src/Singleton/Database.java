package Singleton;

public class Database {
	
	//Itt hozom létre az objektumot. Ez az egy darab példány fog létrejönni. Mindenki õt fogja majd használni.
	private static Database instance = new Database();
	
	//Kell egy privát konstruktor, hogy ne lehessen a new kulcsszóval példányosítani.
	private Database()
	{
		
	}
	
	//Visszatérés a már létrehozott objektummal.
	public static Database getInstance() {
		return instance;
	}
	
	//Ez egy példa függvény.
	public String save(String object) {
		return "Person is added to the database";
	}
	

}
