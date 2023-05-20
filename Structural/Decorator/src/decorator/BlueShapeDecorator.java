package decorator;

//Konkr�t dekor�tor oszt�ly, ami az �s dekor�tor oszt�lyb�l sz�rmazik
public class BlueShapeDecorator extends ShapeDecorator {

	public BlueShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
		setBlueBorder();
	}
	
	
	//Dekor�ljuk az alakzatot k�k szeg�llyel.
	public void setBlueBorder() {
		System.out.println("Shape with blue border.");
	}

}
