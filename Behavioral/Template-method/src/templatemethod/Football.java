package templatemethod;

public class Football extends Game {

	@Override
	void initialize() {
		System.out.println("A focimeccsen el�neklik a himnuszt.");
		
	}

	@Override
	void startPlay() {
		System.out.println("Kezd�r�g�s");
		
	}

	@Override
	void endPlay() {
		System.out.println("A b�r� lef�jja a meccset azt�n v�ge vagy tizenegyes");
		
	}

}
