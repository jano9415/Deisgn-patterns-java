package decorator;

public class Main {
	
	public static void main(String[] args) {
		
		//Négyszög létrehozása
		Shape rechtangle = new Rechtangle();
		
		//Kék négyszög objektum létrehozása.
		Shape blueRechtangle = new BlueShapeDecorator(new Rechtangle());
		
		//Kék háromszög objektum létrehozása.
		Shape blueTriangle = new BlueShapeDecorator(new Triangle());
		
		//Narancssárga négyszög objektum létrehozása.
		Shape orangeRechtangle = new OrangeShapeDecorator(new Rechtangle());
		
		//Alap négyszög kirajzolása.
		rechtangle.draw();
		System.out.println();
		
		//Kék négyszög kirajzolása
		blueRechtangle.draw();
		System.out.println();
		
		//Kék háromszög kirajzolása
		blueTriangle.draw();
		System.out.println();
		
		//Narancssárga négyszög kirajzolása
		orangeRechtangle.draw();
		System.out.println();
		
		//Négyszög kék és narancssárga szegéllyel.
		Shape blueAndOrangeRechtangle = new BlueShapeDecorator(new OrangeShapeDecorator(new Rechtangle()));
		blueAndOrangeRechtangle.draw();
		System.out.println();
		
		
	}
	

}


