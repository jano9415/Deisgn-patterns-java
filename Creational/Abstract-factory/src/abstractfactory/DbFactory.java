package abstractfactory;


//�s adatb�zis gy�r oszt�ly
public abstract class DbFactory {
	
	//A getFactory f�ggv�ny adja vissza a megfelel� gy�r objektumot. Att�l f�gg�en, hogy a bej�v�
	//param�ter "relational" vagy "nonrelational"
	public static DbFactory getFactory(String factoryType) {
		switch(factoryType) {
		case "relational" :
			return new RelationalDbFactory();
		case "nonrelational" :
			return new NonRelationDbFactory();
		default :
			throw new IllegalArgumentException("Incorrect type: " + factoryType);
		}
	}
	
	//Ez a f�ggv�ny adja vissza az adatb�zis objektumot, att�l f�gg�en, hogy mit kap param�terben.
	//A param�terek: "mongodb" , "firebasedb" , "mssql" , "pssql"
	//Absztrakt f�ggv�ny, a gyerek oszt�lyok fejtik ki
	public abstract Database getDatabase(String databaseType);

	

}
