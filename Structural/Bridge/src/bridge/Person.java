package bridge;

public class Person extends Thing {
	
	
	public Person(View view1, View view2) {
		super(view1, view2);
	}

	@Override
	public void show() {
		System.out.println("Szem�ly megjelen�tve:");
		System.out.println("N�v: " + this.getName());
		System.out.println("Le�r�s: " + this.getDescription());
		view1.show();
		view2.show();
		
	}

	
	

}
