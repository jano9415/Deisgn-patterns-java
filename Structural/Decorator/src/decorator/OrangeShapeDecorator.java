package decorator;

//Konkrét dekorátor osztály, ami az õs dekorátor osztályból származik
public class OrangeShapeDecorator extends ShapeDecorator {

	public OrangeShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
		setOrangeBorder();
	}
	
	//Dekoráljuk az alakzatot narancssárga szegéllyel.
	public void setOrangeBorder() {
		System.out.println("Shape with orange border.");
	}

}
