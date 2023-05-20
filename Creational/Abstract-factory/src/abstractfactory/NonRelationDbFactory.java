package abstractfactory;

//Nem rel�ci�s adatb�zis gy�r oszt�ly
//Ez az oszt�ly gy�rtja le a nem rel�ci�s t�pus� adatb�zis objektumot
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
