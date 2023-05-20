package composite;

import java.util.ArrayList;
import java.util.List;


//Ez a composite objektum, ami leaf objektumokat tartalmaz
public class DrawGroup implements Shape {
	
	//Alakzatok gyûjteménye.
	private List<Shape> shapes = new ArrayList<>();

	//Rajzolj ki minden alakzatot
	@Override
	public void draw(String color) {
		for(Shape s : shapes) {
			s.draw(color);
		}	
	}
	
	//Mozgass minden alakzatot
	@Override
	public void moveTo(int x, int y) {
		for(Shape s : shapes) {
			s.moveTo(x, y);
		}	
		
	}
	
	//Alakzat hozzáadása
	public void addShape(Shape shape) {
		shapes.add(shape);
	}
	
	//Alakzat törlése
	public void removeShape(Shape shape) {
		shapes.remove(shape);
	}
	
	//Minden alakzat törlése
	public void clearShapes() {
		shapes.clear();
	}



}
