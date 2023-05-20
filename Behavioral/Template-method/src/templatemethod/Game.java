package templatemethod;

public abstract class Game {
	
	//Ezeket a f�ggv�nyeket a gyerek oszt�lyok fel�l �rj�k
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
	
	//Ez a f�ggv�ny minden gyerek oszt�ly eset�n azonos
	private void advertise() {
		System.out.println("Meccs meghirdet�se");
	}
	
	//Sablon f�ggv�ny
	//Final, ez�rt a gyerek oszt�lyok ezt a f�ggv�nyt nem tudj�k fel�l �rni
	public final void play() {
		
		//J�t�k meghirdet�se
		advertise();
		//J�t�k inicializ�l�sa
		initialize();
		//J�t�k kezd�se
		startPlay();
		//J�t�k befejez�se
		endPlay();
		
	}

}
