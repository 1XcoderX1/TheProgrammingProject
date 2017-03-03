package acm634;

public class Calculator1 {
	
	public static void main(String[] args) {
		
		String operation = args[0];
		String a = args[1];
		String b = args[2];
		
		double x = Double.parseDouble(a);
		double y = Double.parseDouble(b);
		
		if (operation.equals("sum")) {
			
			double sum = x + y;
			System.out.println("The solution to this operation is: " + sum);
		}
		
		else if (operation.equals("substraction")) {
			
			double substraction = x - y;
			System.out.println("The solution to this operation is: " + substraction);	
		}
		
		else if (operation.equals("multiplication")) {
			
			double multiplication = x * y;
			System.out.println("The solution to this operation is: " + multiplication);
		}
		
		else if (operation.equals("division")) {
			
			double division = x / y;
			System.out.println("The solution to this operation is: " + division);
		}
		
	}

}
