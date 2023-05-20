package decorator;

//Konkr�t dekor�tor oszt�ly, ami az �s dekor�tor oszt�lyb�l sz�rmazik
public class OrangeShapeDecorator extends ShapeDecorator {

	public OrangeShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
		setOrangeBorder();
	}
	
	//Dekor�ljuk az alakzatot narancss�rga szeg�llyel.
	public void setOrangeBorder() {
		System.out.println("Shape with orange border.");
	}

}
