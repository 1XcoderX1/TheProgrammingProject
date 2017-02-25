package acm634;

public class Calculator {
	
	String g;
	double x;
	double y;
	
	public Calculator(String g, double x, double y) {
		
		this.g = g;
		this.x = x;
		this.y = y;
	}

	
	public void sum(){
		
		if(g.equals("sum")){
			
			double sum = x + y;
			System.out.println("The sum of the numbers is: " + sum);		
		}
			else System.out.println("You need to type 'sum' if you want to add numbers.");	
	}
	
	public void substraction(){
		
		if(g.equals("substraction")){
			
			double substraction = x - y;
			System.out.println("The substraction of these numbers is:" + substraction);			
		}
		
		else System.out.println("You need to type 'substraction' if you want to substract numbers.");
	}
	
	
	public void multiplication(){
		
		if(g.equals("multiplication")){
			
			double multiplication = x * y;
			System.out.println("The result of multiplicating these numbers is: " + multiplication);
		}
		
		else System.out.println("You need to type 'multiplication' if you want to multiply numbers.");
		
	}
	
	public void division(){
		
		if(g.equals("division")){
			
			double division = x / y;
			System.out.println("The result of dividing these numbers is: " + division);			
		}
		
		else System.out.println("You need to type 'division' if you want to divide numbers.");		
	}
}
