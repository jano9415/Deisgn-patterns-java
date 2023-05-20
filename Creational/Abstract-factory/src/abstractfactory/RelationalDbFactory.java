package abstractfactory;

//Relációs adatbázis gyár osztály
//Ez az osztály gyártja le a relációs típusú adatbázis objektumot
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
