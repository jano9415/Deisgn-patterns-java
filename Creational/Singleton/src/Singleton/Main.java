package Singleton;

public class Main {
	
	public static void main(String[] args) {
		
		//Objektum l�trehoz�sa
		Database databaseObject = Database.getInstance();
		
		//P�lda f�ggv�ny megh�v�sa
		System.out.println(databaseObject.save("Laci"));
		
		//Objektum mem�riac�me
		System.out.println("Database object memory address: " + databaseObject.hashCode());
		
		
		
		
		
		
		//M�g egy objektum l�trehoz�sa, ami ugyan az lesz, mint az el�z�.
		
		//Objektum l�trehoz�sa
		Database databaseObject2 = Database.getInstance();
		
		//P�lda f�ggv�ny megh�v�sa
		System.out.println(databaseObject.save("Laci"));
		
		//Objektum mem�riac�me
		System.out.println("Database object memory address: " + databaseObject.hashCode());
		
		
		
		
	}

}