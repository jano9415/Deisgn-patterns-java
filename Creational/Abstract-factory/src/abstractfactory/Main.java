package abstractfactory;

public class Main {
	
	public static void main(String[] args) {
		
		//Relációs adatbázis gyár objektum létrehozása
		DbFactory relationalDbFactory = DbFactory.getFactory("relational");
		
		//Microsoft sql adatbázis objektum létrehozása
		//Microsoft sql műveletek végrehajtása
		Database msSqlDatabase = relationalDbFactory.getDatabase("mssql");
		
		msSqlDatabase.connect();
		msSqlDatabase.select();
		msSqlDatabase.insert();
		msSqlDatabase.delete();
		System.out.println();
		
		//Postgre sql adatbázis objektum létrehozása
		//Postgre sql műveletek végrehajtása
		Database psSqlDatabase = relationalDbFactory.getDatabase("pssql");
		
		psSqlDatabase.connect();
		psSqlDatabase.select();
		psSqlDatabase.insert();
		psSqlDatabase.delete();
		System.out.println();
		
		
		
		//Nem relációs adatbázis gyár objektum létrehozása
		DbFactory nonRelationalDbFactory = DbFactory.getFactory("nonrelational");
		
		//Mongodb adatbázis objektum létrehozása
		//Mongodb sql műveletek végrehajtása
		Database mongoDatabase = nonRelationalDbFactory.getDatabase("mongodb");
		
		mongoDatabase.connect();
		mongoDatabase.select();
		mongoDatabase.insert();
		mongoDatabase.delete();
		System.out.println();
		
		//Firebase adatbázis objektum létrehozása
		//Firebase műveletek végrehajtása
		Database firebaseDatabase = nonRelationalDbFactory.getDatabase("firebasedb");
		
		firebaseDatabase.connect();
		firebaseDatabase.select();
		firebaseDatabase.insert();
		firebaseDatabase.delete();
		System.out.println();
		
	}
	

	
	
	

}
