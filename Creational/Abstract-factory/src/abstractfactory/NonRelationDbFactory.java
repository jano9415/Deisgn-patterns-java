package abstractfactory;

//Nem relációs adatbázis gyár osztály
//Ez az osztály gyártja le a nem relációs típusú adatbázis objektumot
public class NonRelationDbFactory extends DbFactory {

	@Override
	public Database getDatabase(String databaseType) {
		switch(databaseType) {
		case "mongodb" :
			return new MongoDb();
		case "firebasedb" :
			return new FirebaseDb();
		default :
			throw new IllegalArgumentException("Incorrect type: " + databaseType);
		}
	}
	

}
