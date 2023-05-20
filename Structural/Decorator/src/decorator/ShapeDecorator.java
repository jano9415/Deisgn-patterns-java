package decorator;

//Absztrakt õs dekorátor osztály
public abstract class ShapeDecorator implements Shape {
	
	//Tartalmaz egy alakzatot, amit majd dekorálni akarunk
	protected Shape decoratedShape;
	
	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	
	public void draw() {
		decoratedShape.draw();
	}
	
	

}
