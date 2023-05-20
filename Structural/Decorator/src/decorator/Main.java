package decorator;

public class Main {
	
	public static void main(String[] args) {
		
		//N�gysz�g l�trehoz�sa
		Shape rechtangle = new Rechtangle();
		
		//K�k n�gysz�g objektum l�trehoz�sa.
		Shape blueRechtangle = new BlueShapeDecorator(new Rechtangle());
		
		//K�k h�romsz�g objektum l�trehoz�sa.
		Shape blueTriangle = new BlueShapeDecorator(new Triangle());
		
		//Narancss�rga n�gysz�g objektum l�trehoz�sa.
		Shape orangeRechtangle = new OrangeShapeDecorator(new Rechtangle());
		
		//Alap n�gysz�g kirajzol�sa.
		rechtangle.draw();
		System.out.println();
		
		//K�k n�gysz�g kirajzol�sa
		blueRechtangle.draw();
		System.out.println();
		
		//K�k h�romsz�g kirajzol�sa
		blueTriangle.draw();
		System.out.println();
		
		//Narancss�rga n�gysz�g kirajzol�sa
		orangeRechtangle.draw();
		System.out.println();
		
		//N�gysz�g k�k �s narancss�rga szeg�llyel.
		Shape blueAndOrangeRechtangle = new BlueShapeDecorator(new OrangeShapeDecorator(new Rechtangle()));
		blueAndOrangeRechtangle.draw();
		System.out.println();
		
		
	}
	

}


