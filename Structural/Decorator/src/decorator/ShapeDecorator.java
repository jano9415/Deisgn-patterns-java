package decorator;

//Absztrakt �s dekor�tor oszt�ly
public abstract class ShapeDecorator implements Shape {
	
	//Tartalmaz egy alakzatot, amit majd dekor�lni akarunk
	protected Shape decoratedShape;
	
	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	
	public void draw() {
		decoratedShape.draw();
	}
	
	

}
