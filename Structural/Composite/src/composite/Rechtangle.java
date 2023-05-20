package composite;

//Ebbõl az osztályból jönnek létre a leaf objektumok
public class Rechtangle implements Shape {

	@Override
	public void draw(String color) {
		System.out.println("Drawing rechtangle with " + color + " color.");
		
	}

	@Override
	public void moveTo(int x, int y) {
		System.out.println("Rechtangle moved to " + x + ":" + y + " coordinate.");
		
	}

}
