package abstractfactory;

//Rel�ci�s adatb�zis gy�r oszt�ly
//Ez az oszt�ly gy�rtja le a rel�ci�s t�pus� adatb�zis objektumot
public class RelationalDbFactory extends DbFactory {

	@Override
	public Database getDatabase(String databaseType) {
		switch(databaseType) {
		case "mssql" :
			return new MsSql();
		case "pssql" :
			return new PsSql();
		default :
			throw new IllegalArgumentException("Incorrect type: " + databaseType);
		}
	}

}
