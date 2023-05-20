package templatemethod;

public abstract class Game {
	
	//Ezeket a függvényeket a gyerek osztályok felül írják
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
	
	//Ez a függvény minden gyerek osztály esetén azonos
	private void advertise() {
		System.out.println("Meccs meghirdetése");
	}
	
	//Sablon függvény
	//Final, ezért a gyerek osztályok ezt a függvényt nem tudják felül írni
	public final void play() {
		
		//Játék meghirdetése
		advertise();
		//Játék inicializálása
		initialize();
		//Játék kezdése
		startPlay();
		//Játék befejezése
		endPlay();
		
	}

}
