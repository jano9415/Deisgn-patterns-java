package strategy;

//Szorz�s, konkr�t strat�gia.
public class MultiplyOperation implements Strategy {

	@Override
	public int doOperation(int number1, int number2) {

		return number1 * number2;
	}

}
