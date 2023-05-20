package adapter;

public class Main {
	
	public static void main(String[] args) {
		
		Bird parrot = new Parrot();
		Bird eagle = new Eagle();
		
		ToyBird toyDuck = new ToyDuck();
		ToyBird toyGoose = new ToyGoose();
		
		//Adapter objektum létrehozása a valódi madár és a játék madár közé
		//A játék madár úgy fog viselkedni, mint egy igazi madár
		//Eléri a papagáj osztály makeRealSound() és hunt() függvényeit
		ToyBird birdAdapter = new BirdAdapter(parrot);
		
		//Papagáj
		System.out.println("Parrot....");
		parrot.fly();
		parrot.makeRealSound();
		
		//Játékkacsa
		System.out.println("Toyduck....");
		toyDuck.makeArtificalSound();
		
		//Játék madár ami igazi papagájként viselkedik
		//Igazi papagáj hangot tud kiadni
		System.out.println("Birdadapter....");
		birdAdapter.makeArtificalSound();
		
		//Játék madár ami igazi sasként viselkedik
		//Igazi sas hangot tud kiadni
		birdAdapter = new BirdAdapter(eagle);
		birdAdapter.makeArtificalSound();
		
		//Úgy vadászik, mint a sas
		birdAdapter.hunt();
		
		//Úgy vadászik, mint a papagáj
		birdAdapter = new BirdAdapter(parrot);
		birdAdapter.hunt();
		
		
		

		

	}
	


}


