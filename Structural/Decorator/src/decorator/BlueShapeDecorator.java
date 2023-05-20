package decorator;

//Konkrét dekorátor osztály, ami az õs dekorátor osztályból származik
public class BlueShapeDecorator extends ShapeDecorator {

	public BlueShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
		setBlueBorder();
	}
	
	
	//Dekoráljuk az alakzatot kék szegéllyel.
	public void setBlueBorder() {
		System.out.println("Shape with blue border.");
	}

}
