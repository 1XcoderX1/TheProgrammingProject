package dining;

public class Dine {

	public static void main(String[] args) {

		Object f1 = new Object();
		Object f2 = new Object();
		Object f3 = new Object();
		Object f4 = new Object();

		Philosopher p1 = new Philosopher("Socrates", f1, f2);
		Philosopher p2 = new Philosopher("Descartes", f2, f3);
		Philosopher p3 = new Philosopher("Plato", f3, f4);
		Philosopher p4 = new Philosopher("Archit", f4, f1);
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();

	}

}
