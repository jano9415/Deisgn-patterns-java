package Singleton;

public class Main {
	
	public static void main(String[] args) {
		
		//Objektum létrehozása
		Database databaseObject = Database.getInstance();
		
		//Példa függvény meghívása
		System.out.println(databaseObject.save("Laci"));
		
		//Objektum memóriacíme
		System.out.println("Database object memory address: " + databaseObject.hashCode());
		
		
		
		
		
		
		//Még egy objektum létrehozása, ami ugyan az lesz, mint az előző.
		
		//Objektum létrehozása
		Database databaseObject2 = Database.getInstance();
		
		//Példa függvény meghívása
		System.out.println(databaseObject.save("Laci"));
		
		//Objektum memóriacíme
		System.out.println("Database object memory address: " + databaseObject.hashCode());
		
		
		
		
	}

}
