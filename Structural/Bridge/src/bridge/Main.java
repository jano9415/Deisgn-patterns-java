package bridge;

public class Main {
	
	public static void main(String[] args) {
		
		//Absztarkt oszt�ly -> Thing
		//Interf�sz: -> View
		//Kapcsolat az absztarkt oszt�ly �s az interf�sz k�z�tt
		//A szem�lyt �s a term�ket is meg tudom jelen�teni t�bl�zatos �s gal�ria n�zetben is
		
		Thing thing1 = new Person(new TableView(), new ImageView());
		thing1.setName("Nagy L�szl�");
		thing1.setDescription("Ez az �n le�r�som");
		thing1.show();
		
		
		Thing thing2 = new Product(new TableView(), new ImageView());
		thing2.setName("Iphone x");
		thing2.setTitle("Mobiltelefon");
		thing2.setDescription("Ez egy mobiltelefon");
		thing2.show();
	}

}
