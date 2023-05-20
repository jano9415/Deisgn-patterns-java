package Singleton;

public class Database {
	
	//Itt hozom l�tre az objektumot. Ez az egy darab p�ld�ny fog l�trej�nni. Mindenki �t fogja majd haszn�lni.
	private static Database instance = new Database();
	
	//Kell egy priv�t konstruktor, hogy ne lehessen a new kulcssz�val p�ld�nyos�tani.
	private Database()
	{
		
	}
	
	//Visszat�r�s a m�r l�trehozott objektummal.
	public static Database getInstance() {
		return instance;
	}
	
	//Ez egy p�lda f�ggv�ny.
	public String save(String object) {
		return "Person is added to the database";
	}
	

}
