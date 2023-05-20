package composite;

//Ebbõl az osztályból jönnek létre a leaf objektumok
public class Circle implements Shape {

	@Override
	public void draw(String color) {
		System.out.println("Drawing circle with " + color + " color.");
		
	}

	@Override
	public void moveTo(int x, int y) {
		System.out.println("Circle moved to " + x + ":" + y + " coordinate.");
		
	}

}
