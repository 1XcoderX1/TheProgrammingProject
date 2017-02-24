
public class Calculator {

	String s;
	int x;
	int y;

	public Calculator(String s, int x, int y) {

		this.s = s;
		this.x = x;
		this.y = y;

	}

	public void sum() {
		
		if(s.equals("sum")){
			int sum = x + y;
			System.out.println("The sum is " + sum );
		}
		
		else System.out.println("Not a sum calculator.");;
	}

}
