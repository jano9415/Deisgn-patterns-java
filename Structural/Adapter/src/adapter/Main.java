package adapter;

public class Main {
	
	public static void main(String[] args) {
		
		Bird parrot = new Parrot();
		Bird eagle = new Eagle();
		
		ToyBird toyDuck = new ToyDuck();
		ToyBird toyGoose = new ToyGoose();
		
		//Adapter objektum l�trehoz�sa a val�di mad�r �s a j�t�k mad�r k�z�
		//A j�t�k mad�r �gy fog viselkedni, mint egy igazi mad�r
		//El�ri a papag�j oszt�ly makeRealSound() �s hunt() f�ggv�nyeit
		ToyBird birdAdapter = new BirdAdapter(parrot);
		
		//Papag�j
		System.out.println("Parrot....");
		parrot.fly();
		parrot.makeRealSound();
		
		//J�t�kkacsa
		System.out.println("Toyduck....");
		toyDuck.makeArtificalSound();
		
		//J�t�k mad�r ami igazi papag�jk�nt viselkedik
		//Igazi papag�j hangot tud kiadni
		System.out.println("Birdadapter....");
		birdAdapter.makeArtificalSound();
		
		//J�t�k mad�r ami igazi sask�nt viselkedik
		//Igazi sas hangot tud kiadni
		birdAdapter = new BirdAdapter(eagle);
		birdAdapter.makeArtificalSound();
		
		//�gy vad�szik, mint a sas
		birdAdapter.hunt();
		
		//�gy vad�szik, mint a papag�j
		birdAdapter = new BirdAdapter(parrot);
		birdAdapter.hunt();
		
		
		

		

	}
	


}


