package strategy;

public class Main {

	public static void main(String[] args) {
		
		Context context = new Context(new AddOperation());
		System.out.println("5 + 3 = " + context.executeStrategy(5, 3));
		
		context = new Context(new SubtractOperation());
		System.out.println("10 - 6 = " + context.executeStrategy(10, 6));
		
		context = new Context(new MultiplyOperation());
		System.out.println("20 * 4 = " + context.executeStrategy(20, 4));
	}
}
