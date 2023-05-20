package composite;

public class Main {
	
	public static void main(String[] args) {
		
		//Négyszög
		Shape rechtangle = new Rechtangle();
		Shape rechtangle2 = new Rechtangle();
		
		//Kör
		Shape circle = new Circle();
		Shape circle2 = new Circle();
		
		//Egy alakzat kirajzolása
		rechtangle.draw("green");
		System.out.println();
		
		//Group1 csoport létrehozása
		DrawGroup group1 = new DrawGroup();
		group1.addShape(rechtangle);
		group1.addShape(rechtangle2);
		group1.addShape(circle);
		group1.addShape(circle2);
		
		//Minden alakzat kirajzolása a group1 csoportban
		group1.draw("black");
		System.out.println();
		
		//Mozgasd a csoportot ehhez a koordinátához
		group1.moveTo(10, 45);
		System.out.println();
		
		//Új csoport létrehozása. Ez a csoport tartalmazza az elõzõ csoportot plusz egy darab háromszöget
		DrawGroup group2 = new DrawGroup();
		group2.addShape(rechtangle);
		group2.addShape(group1);
		group2.draw("blue");
	}

}
