package abstractfactory;

public interface Database {
	
	//N�h�ny p�lda f�ggv�ny, amit el tud v�gezni az adott adatb�zis objektum
	void connect();
	void select();
	void insert();
	void delete();

}
