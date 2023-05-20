package mediator;

public class Main {
	
	public static void main(String[] args) {
		User laci = new User("Laci");
		User bela = new User("Bela");
		
		laci.sendMessage("Szia Bela");
		
		bela.sendMessage("Hello Laci");
	}

}
