package Builder;

public class Main {
	
	public static void main(String[] args) {
		
		//Megadom a k�telez� �s az opcion�lis param�tereket is
		Computer computer1 = new Computer.ComputerBuilder(4000, "hddtype", "gcardtype")
				.bluetooth(false)
				.networkcardType("ncardtype").build();
		
		System.out.println(computer1.toString());
		
		//Csak a k�telez� param�tereket adom meg
		Computer computer2 = new Computer.ComputerBuilder(6000, "hddtype2", "gcardtype2").build();
		
		
		System.out.println(computer2.toString());

		
	}

}
