package acm634;

public class CalculatorTest {

	public static void main(String[] args) {
		
		String g = "division";
		double x = 50;
		double y = 90 ;
		
		Calculator calculator = new Calculator(g, x, y);

		
		
		
		calculator.sum();
		calculator.substraction();
		calculator.multiplication();
		calculator.division();

	}

}
