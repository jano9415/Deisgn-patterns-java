package strategy;

//Stratégia interfész. Ezt fogják implementálni a konkrét stratégiák.
public interface Strategy {
	
	public int doOperation(int number1, int number2);

}
