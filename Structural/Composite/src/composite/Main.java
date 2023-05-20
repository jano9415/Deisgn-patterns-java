package composite;

public class Main {
	
	public static void main(String[] args) {
		
		//N�gysz�g
		Shape rechtangle = new Rechtangle();
		Shape rechtangle2 = new Rechtangle();
		
		//K�r
		Shape circle = new Circle();
		Shape circle2 = new Circle();
		
		//Egy alakzat kirajzol�sa
		rechtangle.draw("green");
		System.out.println();
		
		//Group1 csoport l�trehoz�sa
		DrawGroup group1 = new DrawGroup();
		group1.addShape(rechtangle);
		group1.addShape(rechtangle2);
		group1.addShape(circle);
		group1.addShape(circle2);
		
		//Minden alakzat kirajzol�sa a group1 csoportban
		group1.draw("black");
		System.out.println();
		
		//Mozgasd a csoportot ehhez a koordin�t�hoz
		group1.moveTo(10, 45);
		System.out.println();
		
		//�j csoport l�trehoz�sa. Ez a csoport tartalmazza az el�z� csoportot plusz egy darab h�romsz�get
		DrawGroup group2 = new DrawGroup();
		group2.addShape(rechtangle);
		group2.addShape(group1);
		group2.draw("blue");
	}

}
