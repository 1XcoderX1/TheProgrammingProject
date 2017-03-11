package eatingProblem;

public class Eat {
	public static void main(String[] args) {

		Cutlery c = new Cutlery();

		Sakora sakora = new Sakora(c);
		Fuga fuga = new Fuga(c);

		sakora.start();
		fuga.start();

	}

}
