package Lecture3;

public class TakeOneArgument {

	public static void main(String[] args) {
		
		
		String a = args[0];
		String b = args[1];
		String c = args[2];
		String d = args[3];
		
		double x = Double.parseDouble(a);
		double y = Double.parseDouble(b);
		double sum = x + y;
		
		double z = Double.parseDouble(c);
		double w = Double.parseDouble(d);
		double division = z / w;
		
		System.out.println(sum);
		System.out.println(division);

	}

}
